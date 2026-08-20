package patterns.behavioral.chainofresponsibility.problem;

public class SupportChainProblem {
    public String handle(String issueType) {
        if ("password".equals(issueType)) {
            return "Help desk reset the password";
        }
        if ("billing".equals(issueType)) {
            return "Billing team updated the invoice";
        }
        if ("security".equals(issueType)) {
            return "Security team opened an incident";
        }
        return "No team found";
    }
}
