package stark.coderaider.genericagent.context;

public interface ContextWriteBack
{
    void onUserInput(String threadId, String userInput);

    void onAssistantOutput(String threadId, String assistantOutput);
}
