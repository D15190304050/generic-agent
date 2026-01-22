package stark.coderaider.genericagent.context;

public class BudgetResult
{
    private final MessageList messageList;
    private final boolean overflowed;

    public BudgetResult(MessageList messageList, boolean overflowed)
    {
        this.messageList = messageList;
        this.overflowed = overflowed;
    }

    public MessageList getMessageList()
    {
        return messageList;
    }

    public boolean isOverflowed()
    {
        return overflowed;
    }
}
