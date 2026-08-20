package patterns.behavioral.command.problem;

public class EditorCommandProblem {
    private String text = "";

    public String click(String button, String value) {
        if ("type".equals(button)) {
            text += value;
        } else if ("clear".equals(button)) {
            text = "";
        } else if ("print".equals(button)) {
            return text;
        }
        return "Text: " + text;
    }
}
