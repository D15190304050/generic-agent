package stark.coderaider.genericagent.context;

import java.util.Collections;
import java.util.List;

public class InMemoryCodeIndex implements CodeIndex
{
    public List<ContextEntry> search(String query)
    {
        return Collections.emptyList();
    }
}
