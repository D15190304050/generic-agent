package stark.coderaider.genericagent.llm;

/**
 * 统一封装“工具调用”能力，可以是 MCP、HTTP API、本地方法等多种实现。
 * <p>
 * Agent 通过该接口间接调用工具，而不感知底层协议和部署方式。
 */
public interface IToolExecutor
{
}
