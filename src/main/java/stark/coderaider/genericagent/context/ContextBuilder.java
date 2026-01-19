package stark.coderaider.genericagent.context;

public interface ContextBuilder
{
    MessageList build(ContextRequest request, ContextPieces pieces);
}
