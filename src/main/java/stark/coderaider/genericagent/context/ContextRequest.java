package stark.coderaider.genericagent.context;

public class ContextRequest
{
    private final String threadId;
    private final String userInput;
    private final String systemPrompt;

    public ContextRequest(String threadId, String userInput, String systemPrompt)
    {
        this.threadId = threadId;
        this.userInput = userInput;
        this.systemPrompt = systemPrompt;
    }

    public String getThreadId()
    {
        return threadId;
    }

    public String getUserInput()
    {
        return userInput;
    }

    public String getSystemPrompt()
    {
        return systemPrompt;
    }
}
