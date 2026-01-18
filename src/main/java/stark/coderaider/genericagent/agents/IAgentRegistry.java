package stark.coderaider.genericagent.agents;

/**
 * AgentRegistry 负责 Agent 的注册、查找和选择。
 * <p>
 * 设计预期：
 * <ul>
 *     <li>按照 id / name 获取具体 Agent 实例</li>
 *     <li>支持基于 Capability 的 Agent 选择，用于 handoff 路由</li>
 * </ul>
 * 这是 AgentRuntime 做 handoff 时的核心依赖之一。
 */
public interface IAgentRegistry
{
}
