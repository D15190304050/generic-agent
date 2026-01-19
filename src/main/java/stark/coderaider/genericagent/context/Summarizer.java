package stark.coderaider.genericagent.context;

import java.util.List;

public interface Summarizer
{
    String summarize(List<Message> recentTurns);
}
