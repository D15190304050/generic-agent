package stark.coderaider.genericagent.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MessageList
{
    private final List<Message> messages;

    public MessageList()
    {
        this.messages = new ArrayList<>();
    }

    public MessageList(List<Message> messages)
    {
        this.messages = new ArrayList<>(messages);
    }

    public void addMessage(Message message)
    {
        messages.add(message);
    }

    public List<Message> getMessages()
    {
        return Collections.unmodifiableList(messages);
    }

    public int size()
    {
        return messages.size();
    }
}
