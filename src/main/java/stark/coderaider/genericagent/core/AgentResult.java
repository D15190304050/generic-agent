package stark.coderaider.genericagent.core;

/**
 * 表示一次 Agent 执行之后，对“控制权”的声明结果。
 * <p>
 * 典型结果形态（后续可以拆分为具体子类或 sealed hierarchy）：
 * <ul>
 *     <li>Continue：当前 Agent 希望继续处理后续轮次</li>
 *     <li>Finish：本次对话线程可以结束</li>
 *     <li>Handoff：把控制权交给另一个 Agent</li>
 * </ul>
 * AgentExecutionLoop 和 IAgentRuntime 会根据不同结果决定下一步控制流。
 */
public class AgentResult
{
    public static enum Type
    {
        Continue,
        Finish,
        Handoff,
    }
}
