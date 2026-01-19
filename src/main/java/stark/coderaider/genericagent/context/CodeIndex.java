package stark.coderaider.genericagent.context;

import java.util.List;

public interface CodeIndex
{
    List<ContextEntry> search(String query);
}
