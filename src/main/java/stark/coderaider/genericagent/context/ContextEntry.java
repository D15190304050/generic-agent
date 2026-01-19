package stark.coderaider.genericagent.context;

public class ContextEntry
{
    private final ContextEntrySource source;
    private final String content;

    public ContextEntry(ContextEntrySource source, String content)
    {
        this.source = source;
        this.content = content;
    }

    public ContextEntrySource getSource()
    {
        return source;
    }

    public String getContent()
    {
        return content;
    }
}
