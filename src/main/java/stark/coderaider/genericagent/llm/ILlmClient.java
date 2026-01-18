package stark.coderaider.genericagent.llm;

/**
 * 对底层 LLM 提供统一抽象，屏蔽具体厂商 / SDK 差异。
 * <p>
 * 设计目标：
 * <ul>
 *     <li>可以适配 Spring AI、OpenAI Agents 等不同实现</li>
 *     <li>对 Agent 层只暴露“对话 / 推理”的能力，而不是细节参数</li>
 * </ul>
 * 具体方法（如 chatCompletion 等）可在接入首个模型时再确定。
 */
public interface ILlmClient
{
    // chatCompletion()
}
