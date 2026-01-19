package stark.coderaider.genericagent.context;

public interface EligibilityJudge
{
    boolean shouldWriteToRag(String threadId, Message message);
}
