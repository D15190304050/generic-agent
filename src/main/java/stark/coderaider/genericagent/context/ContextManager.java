package stark.coderaider.genericagent.context;

public interface ContextManager
{
    MessageList buildMessageList(ContextRequest request);

    void onUserInput(ContextRequest request);

    void onAssistantOutput(String threadId, String assistantOutput);
}
