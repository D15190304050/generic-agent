package stark.coderaider.genericagent.context;

public interface SummaryStore
{
    String loadSummary(String threadId);

    void saveSummary(String threadId, String summary);
}
