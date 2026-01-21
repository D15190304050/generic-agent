package stark.coderaider.genericagent.context;

import java.util.List;

public interface ICodeIndex
{
    List<ContextEntry> search(String query);
}
