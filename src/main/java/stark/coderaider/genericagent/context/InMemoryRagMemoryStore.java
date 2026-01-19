package stark.coderaider.genericagent.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRagMemoryStore implements RagMemoryStore
{
    private final Map<String, List<ContextEntry>> storage;

    public InMemoryRagMemoryStore()
    {
        this.storage = new HashMap<>();
    }

    public List<ContextEntry> retrieve(String threadId, String query)
    {
        List<ContextEntry> entries = storage.getOrDefault(threadId, List.of());
        return Collections.unmodifiableList(new ArrayList<>(entries));
    }

    public void write(String threadId, String content)
    {
        storage.computeIfAbsent(threadId, ignored -> new ArrayList<>())
            .add(new ContextEntry(ContextEntrySource.RAG_MEMORY, content));
    }
}
