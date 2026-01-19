package stark.coderaider.genericagent.context;

public class DefaultContextWriteBack implements ContextWriteBack
{
    private final RecentTurnsStore recentTurnsStore;
    private final WriteBackStore writeBackStore;
    private final RagMemoryStore ragMemoryStore;
    private final EligibilityJudge eligibilityJudge;

    public DefaultContextWriteBack(RecentTurnsStore recentTurnsStore, WriteBackStore writeBackStore, RagMemoryStore ragMemoryStore, EligibilityJudge eligibilityJudge)
    {
        this.recentTurnsStore = recentTurnsStore;
        this.writeBackStore = writeBackStore;
        this.ragMemoryStore = ragMemoryStore;
        this.eligibilityJudge = eligibilityJudge;
    }

    public void onUserInput(String threadId, String userInput)
    {
        Message message = new Message(MessageRole.USER, userInput);
        recentTurnsStore.append(threadId, message);
        writeBackStore.persistRaw(threadId, message);
        if (eligibilityJudge.shouldWriteToRag(threadId, message))
        {
            ragMemoryStore.write(threadId, userInput);
        }
    }

    public void onAssistantOutput(String threadId, String assistantOutput)
    {
        Message message = new Message(MessageRole.ASSISTANT, assistantOutput);
        recentTurnsStore.append(threadId, message);
        writeBackStore.persistRaw(threadId, message);
        if (eligibilityJudge.shouldWriteToRag(threadId, message))
        {
            ragMemoryStore.write(threadId, assistantOutput);
        }
    }
}
