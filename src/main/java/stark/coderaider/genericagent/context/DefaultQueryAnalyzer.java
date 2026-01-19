package stark.coderaider.genericagent.context;

public class DefaultQueryAnalyzer implements QueryAnalyzer
{
    public QueryPlan analyze(ContextRequest request)
    {
        return new QueryPlan(true, true, true, true, request.getUserInput());
    }
}
