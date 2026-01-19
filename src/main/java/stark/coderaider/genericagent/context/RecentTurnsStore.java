package stark.coderaider.genericagent.context;

import java.util.List;

public interface RecentTurnsStore
{
    List<Message> loadRecentTurns(String threadId);

    void append(String threadId, Message message);
}
