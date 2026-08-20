package patterns.structural.bridge.problem;

public class NotificationBridgeProblem {
    public String send(String urgency, String channel, String message) {
        if ("email".equals(channel) && "normal".equals(urgency)) {
            return "Normal email: " + message;
        }
        if ("email".equals(channel) && "urgent".equals(urgency)) {
            return "Urgent email with escalation: " + message;
        }
        if ("sms".equals(channel) && "normal".equals(urgency)) {
            return "Normal sms: " + message;
        }
        if ("sms".equals(channel) && "urgent".equals(urgency)) {
            return "Urgent sms with escalation: " + message;
        }
        return "Unsupported notification";
    }
}
