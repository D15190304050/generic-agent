package stark.coderaider.genericagent.core;

/**
 * 表示一次对话线程（thread）在当前时刻的上下文视图。
 * <p>
 * 设计目标：
 * <ul>
 *     <li>承载多轮对话的状态，而不是单次请求参数</li>
 *     <li>可以映射到 OpenAI 的 Thread，但支持更丰富的上下文层级</li>
 *     <li>由 AgentRuntime 在每一轮执行前更新和传递</li>
 * </ul>
 * 具体字段和存储结构后续再根据 Context Manager 的设计补充。
 */
public class AgentContext
{
}
