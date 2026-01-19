package stark.coderaider.genericagent.context;

import java.util.List;

public class DefaultContextManager implements ContextManager
{
    private final QueryAnalyzer queryAnalyzer;
    private final RecentTurnsStore recentTurnsStore;
    private final SummaryStore summaryStore;
    private final RagMemoryStore ragMemoryStore;
    private final CodeIndex codeIndex;
    private final FileDocRag fileDocRag;
    private final ContextBuilder contextBuilder;
    private final TokenBudgeter tokenBudgeter;
    private final Summarizer summarizer;
    private final ContextWriteBack contextWriteBack;

    public DefaultContextManager(QueryAnalyzer queryAnalyzer, RecentTurnsStore recentTurnsStore, SummaryStore summaryStore, RagMemoryStore ragMemoryStore, CodeIndex codeIndex, FileDocRag fileDocRag, ContextBuilder contextBuilder, TokenBudgeter tokenBudgeter, Summarizer summarizer, ContextWriteBack contextWriteBack)
    {
        this.queryAnalyzer = queryAnalyzer;
        this.recentTurnsStore = recentTurnsStore;
        this.summaryStore = summaryStore;
        this.ragMemoryStore = ragMemoryStore;
        this.codeIndex = codeIndex;
        this.fileDocRag = fileDocRag;
        this.contextBuilder = contextBuilder;
        this.tokenBudgeter = tokenBudgeter;
        this.summarizer = summarizer;
        this.contextWriteBack = contextWriteBack;
    }

    public MessageList buildMessageList(ContextRequest request)
    {
        QueryPlan plan = queryAnalyzer.analyze(request);
        List<Message> recentTurns = plan.isUseRecentTurns() ? recentTurnsStore.loadRecentTurns(request.getThreadId()) : List.of();
        String summary = summaryStore.loadSummary(request.getThreadId());
        List<ContextEntry> ragEntries = plan.isUseRagMemory() ? ragMemoryStore.retrieve(request.getThreadId(), plan.getQuery()) : List.of();
        List<ContextEntry> codeEntries = plan.isUseCodeIndex() ? codeIndex.search(plan.getQuery()) : List.of();
        List<ContextEntry> docEntries = plan.isUseFileDocRag() ? fileDocRag.search(plan.getQuery()) : List.of();
        ContextPieces pieces = new ContextPieces(recentTurns, summary, ragEntries, codeEntries, docEntries);
        MessageList messageList = contextBuilder.build(request, pieces);
        BudgetResult budgetResult = tokenBudgeter.budget(messageList);
        if (!budgetResult.isOverflowed())
        {
            return budgetResult.getMessageList();
        }
        String newSummary = summarizer.summarize(recentTurns);
        summaryStore.saveSummary(request.getThreadId(), newSummary);
        ContextPieces summarizedPieces = new ContextPieces(List.of(), newSummary, ragEntries, codeEntries, docEntries);
        MessageList summarizedList = contextBuilder.build(request, summarizedPieces);
        return tokenBudgeter.budget(summarizedList).getMessageList();
    }

    public void onUserInput(ContextRequest request)
    {
        contextWriteBack.onUserInput(request.getThreadId(), request.getUserInput());
    }

    public void onAssistantOutput(String threadId, String assistantOutput)
    {
        contextWriteBack.onAssistantOutput(threadId, assistantOutput);
    }
}
