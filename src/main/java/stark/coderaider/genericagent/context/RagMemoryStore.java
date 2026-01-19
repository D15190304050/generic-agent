package stark.coderaider.genericagent.context;

import java.util.List;

public interface RagMemoryStore
{
    List<ContextEntry> retrieve(String threadId, String query);

    void write(String threadId, String content);
}
