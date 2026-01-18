package stark.coderaider.genericagent.runtime;

/**
 * 封装 Agent 执行循环的核心逻辑。
 * <p>
 * 典型流程（伪代码）：
 * <pre>
 * while (steps &lt; maxSteps) {
 *     AgentResult result = currentAgent.execute(context);
 *     根据 result:
 *       - Continue: 继续当前 Agent
 *       - Finish:   结束循环
 *       - Handoff:  根据 handoff 信息切换 currentAgent
 * }
 * </pre>
 * 具体实现可以由 DefaultAgentRuntime 调用本组件完成。
 */
public class AgentExecutionLoop
{
}
