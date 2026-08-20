package patterns.behavioral.memento.problem;

public class TextEditorMementoProblem {
    private String content = "";
    private String publicBackup = "";

    public void type(String value) {
        publicBackup = content;
        content += value;
    }

    public void restore(String backup) {
        content = backup;
    }

    public String content() {
        return content;
    }

    public String publicBackup() {
        return publicBackup;
    }
}
