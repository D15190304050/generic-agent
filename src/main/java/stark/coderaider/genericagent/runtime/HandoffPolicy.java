package stark.coderaider.genericagent.runtime;

/**
 * 定义 handoff 相关的策略和约束。
 * <p>
 * 用途示例：
 * <ul>
 *     <li>限制哪些 Agent 之间允许互相 handoff</li>
 *     <li>结合 Capability / 当前上下文做路由决策</li>
 *     <li>避免形成 handoff 死循环（A-&gt;B-&gt;A...）</li>
 * </ul>
 * 具体策略可以由业务方或上层框架注入实现。
 */
public class HandoffPolicy
{
}
