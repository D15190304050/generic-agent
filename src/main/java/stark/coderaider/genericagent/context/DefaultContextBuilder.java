package stark.coderaider.genericagent.context;

public class DefaultContextBuilder implements ContextBuilder
{
    public MessageList build(ContextRequest request, ContextPieces pieces)
    {
        MessageList messageList = new MessageList();
        if (request.getSystemPrompt() != null && !request.getSystemPrompt().isBlank())
        {
            messageList.addMessage(new Message(MessageRole.SYSTEM, request.getSystemPrompt()));
        }
        if (pieces.getSummary() != null && !pieces.getSummary().isBlank())
        {
            messageList.addMessage(new Message(MessageRole.SYSTEM, pieces.getSummary()));
        }
        for (ContextEntry entry : pieces.getRagEntries())
        {
            messageList.addMessage(new Message(MessageRole.SYSTEM, entry.getContent()));
        }
        for (ContextEntry entry : pieces.getCodeEntries())
        {
            messageList.addMessage(new Message(MessageRole.SYSTEM, entry.getContent()));
        }
        for (ContextEntry entry : pieces.getDocEntries())
        {
            messageList.addMessage(new Message(MessageRole.SYSTEM, entry.getContent()));
        }
        for (Message message : pieces.getRecentTurns())
        {
            messageList.addMessage(message);
        }
        messageList.addMessage(new Message(MessageRole.USER, request.getUserInput()));
        return messageList;
    }
}
