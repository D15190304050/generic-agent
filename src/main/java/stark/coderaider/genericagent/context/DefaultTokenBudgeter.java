package stark.coderaider.genericagent.context;

public class DefaultTokenBudgeter implements TokenBudgeter
{
    private final int maxCharacters;

    public DefaultTokenBudgeter(int maxCharacters)
    {
        this.maxCharacters = maxCharacters;
    }

    public BudgetResult budget(MessageList messageList)
    {
        int total = 0;
        for (Message message : messageList.messages())
        {
            if (message.getContent() != null)
            {
                total += message.getContent().length();
            }
        }
        return new BudgetResult(messageList, total > maxCharacters);
    }
}
