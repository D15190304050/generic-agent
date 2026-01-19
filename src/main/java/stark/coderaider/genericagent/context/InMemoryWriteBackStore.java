package stark.coderaider.genericagent.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryWriteBackStore implements WriteBackStore
{
    private final Map<String, List<Message>> storage;

    public InMemoryWriteBackStore()
    {
        this.storage = new HashMap<>();
    }

    public void persistRaw(String threadId, Message message)
    {
        storage.computeIfAbsent(threadId, ignored -> new ArrayList<>()).add(message);
    }
}
