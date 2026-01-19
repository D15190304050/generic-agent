package stark.coderaider.genericagent.context;

import java.util.HashMap;
import java.util.Map;

public class InMemorySummaryStore implements SummaryStore
{
    private final Map<String, String> summaries;

    public InMemorySummaryStore()
    {
        this.summaries = new HashMap<>();
    }

    public String loadSummary(String threadId)
    {
        return summaries.get(threadId);
    }

    public void saveSummary(String threadId, String summary)
    {
        summaries.put(threadId, summary);
    }
}
