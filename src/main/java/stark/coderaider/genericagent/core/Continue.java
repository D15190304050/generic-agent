package stark.coderaider.genericagent.core;

public class Continue implements IAgentResult
{
    public IAgentResult.Type getType()
    {
        return IAgentResult.Type.CONTINUE;
    }

    public static Continue of()
    {
        return new Continue();
    }
}
