package patterns.behavioral.state.problem;

public class DocumentStateProblem {
    private String state = "draft";

    public String publish() {
        if ("draft".equals(state)) {
            state = "moderation";
            return "Moved to moderation";
        }
        if ("moderation".equals(state)) {
            state = "published";
            return "Published";
        }
        if ("published".equals(state)) {
            return "Already published";
        }
        return "Unknown state";
    }

    public String state() {
        return state;
    }
}
