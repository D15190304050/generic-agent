package stark.coderaider.genericagent.agents;

/**
 * AgentRuntime 负责驱动整个 Agent 执行循环，是“调度者”。
 * <p>
 * 典型职责：
 * <ul>
 *     <li>维护当前对话线程的上下文（AgentContext）</li>
 *     <li>在循环中调用当前 active Agent，并根据 AgentResult 决定下一步</li>
 *     <li>处理 Continue / Finish / Handoff 等控制流分支</li>
 * </ul>
 * 实际执行逻辑由 AgentExecutionLoop 和具体实现类（如 DefaultAgentRuntime）承载。
 */
public interface IAgentRuntime
{
}
