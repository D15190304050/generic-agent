package stark.coderaider.genericagent.core;

public class Finish implements IAgentResult
{
    public IAgentResult.Type getType()
    {
        return IAgentResult.Type.FINISH;
    }
}
