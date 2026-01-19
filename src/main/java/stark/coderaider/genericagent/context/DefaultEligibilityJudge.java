package stark.coderaider.genericagent.context;

public class DefaultEligibilityJudge implements EligibilityJudge
{
    public boolean shouldWriteToRag(String threadId, Message message)
    {
        return false;
    }
}
