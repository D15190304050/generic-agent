package stark.coderaider.genericagent.context;

public class Message
{
    private final MessageRole role;
    private final String content;

    public Message(MessageRole role, String content)
    {
        this.role = role;
        this.content = content;
    }

    public MessageRole getRole()
    {
        return role;
    }

    public String getContent()
    {
        return content;
    }
}
