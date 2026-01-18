package stark.coderaider.genericagent.agents;

/**
 * Agent = 一个有职责边界的控制单元（Control Boundary）。
 * <p>
 * 设计思路：
 * <ul>
 *     <li>每次执行接收一个 AgentContext，返回一个 AgentResult</li>
 *     <li>不直接“调用”其他 Agent，交接由 HandoffResult + AgentRuntime 完成</li>
 *     <li>可以内部使用 LLM / Tool，但这些细节对抽象层是透明的</li>
 * </ul>
 * 具体方法签名后续在确定执行语义（多轮、超时、最大步数等）后再补充。
 */
public interface IAgent
{
}
