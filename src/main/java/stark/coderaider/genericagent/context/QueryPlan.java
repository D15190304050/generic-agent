package stark.coderaider.genericagent.context;

public class QueryPlan
{
    private final boolean useRecentTurns;
    private final boolean useRagMemory;
    private final boolean useCodeIndex;
    private final boolean useFileDocRag;
    private final String query;

    public QueryPlan(boolean useRecentTurns, boolean useRagMemory, boolean useCodeIndex, boolean useFileDocRag, String query)
    {
        this.useRecentTurns = useRecentTurns;
        this.useRagMemory = useRagMemory;
        this.useCodeIndex = useCodeIndex;
        this.useFileDocRag = useFileDocRag;
        this.query = query;
    }

    public boolean isUseRecentTurns()
    {
        return useRecentTurns;
    }

    public boolean isUseRagMemory()
    {
        return useRagMemory;
    }

    public boolean isUseCodeIndex()
    {
        return useCodeIndex;
    }

    public boolean isUseFileDocRag()
    {
        return useFileDocRag;
    }

    public String getQuery()
    {
        return query;
    }
}
