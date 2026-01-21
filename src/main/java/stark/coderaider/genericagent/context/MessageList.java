package stark.coderaider.genericagent.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record MessageList(List<Message> messages)
{
    public MessageList()
    {
        this(new ArrayList<>());
    }

    public MessageList(List<Message> messages)
    {
        this.messages = new ArrayList<>(messages);
    }

    public void addMessage(Message message)
    {
        messages.add(message);
    }

    @Override
    public List<Message> messages()
    {
        return Collections.unmodifiableList(messages);
    }

    public int size()
    {
        return messages.size();
    }
}
