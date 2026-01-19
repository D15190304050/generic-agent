package stark.coderaider.genericagent.context;

public interface WriteBackStore
{
    void persistRaw(String threadId, Message message);
}
