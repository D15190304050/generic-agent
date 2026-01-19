package stark.coderaider.genericagent.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContextPieces
{
    private final List<Message> recentTurns;
    private final String summary;
    private final List<ContextEntry> ragEntries;
    private final List<ContextEntry> codeEntries;
    private final List<ContextEntry> docEntries;

    public ContextPieces(List<Message> recentTurns, String summary, List<ContextEntry> ragEntries, List<ContextEntry> codeEntries, List<ContextEntry> docEntries)
    {
        this.recentTurns = new ArrayList<>(recentTurns);
        this.summary = summary;
        this.ragEntries = new ArrayList<>(ragEntries);
        this.codeEntries = new ArrayList<>(codeEntries);
        this.docEntries = new ArrayList<>(docEntries);
    }

    public List<Message> getRecentTurns()
    {
        return Collections.unmodifiableList(recentTurns);
    }

    public String getSummary()
    {
        return summary;
    }

    public List<ContextEntry> getRagEntries()
    {
        return Collections.unmodifiableList(ragEntries);
    }

    public List<ContextEntry> getCodeEntries()
    {
        return Collections.unmodifiableList(codeEntries);
    }

    public List<ContextEntry> getDocEntries()
    {
        return Collections.unmodifiableList(docEntries);
    }
}
