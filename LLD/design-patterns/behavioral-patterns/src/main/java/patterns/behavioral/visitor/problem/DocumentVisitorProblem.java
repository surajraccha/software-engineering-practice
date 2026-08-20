package patterns.behavioral.visitor.problem;

import java.util.List;

public class DocumentVisitorProblem {
    public String exportMarkdown(List<Object> nodes) {
        StringBuilder markdown = new StringBuilder();
        for (Object node : nodes) {
            if (node instanceof Heading heading) {
                markdown.append("# ").append(heading.text()).append("\n");
            } else if (node instanceof Paragraph paragraph) {
                markdown.append(paragraph.text()).append("\n");
            }
        }
        return markdown.toString();
    }

    public record Heading(String text) {
    }

    public record Paragraph(String text) {
    }
}
