package stark.coderaider.genericagent.context;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRecentTurnsStore implements RecentTurnsStore
{
    private final Map<String, Deque<Message>> storage;
    private final int maxMessages;

    public InMemoryRecentTurnsStore(int maxMessages)
    {
        this.storage = new HashMap<>();
        this.maxMessages = maxMessages;
    }

    public List<Message> loadRecentTurns(String threadId)
    {
        Deque<Message> messages = storage.getOrDefault(threadId, new ArrayDeque<>());
        return Collections.unmodifiableList(new ArrayList<>(messages));
    }

    public void append(String threadId, Message message)
    {
        Deque<Message> messages = storage.computeIfAbsent(threadId, ignored -> new ArrayDeque<>());
        messages.addLast(message);
        while (messages.size() > maxMessages)
        {
            messages.removeFirst();
        }
    }
}
