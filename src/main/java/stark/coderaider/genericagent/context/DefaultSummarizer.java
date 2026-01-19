package stark.coderaider.genericagent.context;

import java.util.List;

public class DefaultSummarizer implements Summarizer
{
    public String summarize(List<Message> recentTurns)
    {
        StringBuilder builder = new StringBuilder();
        for (Message message : recentTurns)
        {
            builder.append(message.getRole().name()).append(": ").append(message.getContent()).append("\n");
        }
        return builder.toString().trim();
    }
}
