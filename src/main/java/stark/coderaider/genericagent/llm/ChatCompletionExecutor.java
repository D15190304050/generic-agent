package stark.coderaider.genericagent.llm;

import stark.coderaider.genericagent.context.ContextManager;
import stark.coderaider.genericagent.context.ContextRequest;
import stark.coderaider.genericagent.context.MessageList;

public class ChatCompletionExecutor
{
    private final ContextManager contextManager;
    private final ILlmClient llmClient;

    public ChatCompletionExecutor(ContextManager contextManager, ILlmClient llmClient)
    {
        this.contextManager = contextManager;
        this.llmClient = llmClient;
    }

    public String complete(ContextRequest request)
    {
        contextManager.onUserInput(request);
        MessageList messageList = contextManager.buildMessageList(request);
        String output = llmClient.chatCompletion(messageList);
        contextManager.onAssistantOutput(request.getThreadId(), output);
        return output;
    }
}
