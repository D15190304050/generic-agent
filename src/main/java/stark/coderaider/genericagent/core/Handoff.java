package stark.coderaider.genericagent.core;

public class Handoff implements IAgentResult
{
    public IAgentResult.Type getType()
    {
        return IAgentResult.Type.HANDOFF;
    }
}
