package stark.coderaider.genericagent.runtime;

import stark.coderaider.genericagent.agents.IAgentRuntime;

/**
 * IAgentRuntime 的默认实现，负责把各个组件“接线”在一起。
 * <p>
 * 依赖示例：
 * <ul>
 *     <li>AgentExecutionLoop：执行多轮循环和 handoff 控制流</li>
 *     <li>AgentRegistry：根据 id / capability 查找 Agent</li>
 *     <li>RuntimeConfiguration：控制最大步数、超时时间等参数</li>
 * </ul>
 */
public class DefaultAgentRuntime implements IAgentRuntime
{
}
