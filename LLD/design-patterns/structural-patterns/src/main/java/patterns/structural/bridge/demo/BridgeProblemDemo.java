package patterns.structural.bridge.demo;

import patterns.structural.bridge.problem.NotificationBridgeProblem;

public class BridgeProblemDemo {
    public static void main(String[] args) {
        NotificationBridgeProblem notification = new NotificationBridgeProblem();
        System.out.println(notification.send("normal", "email", "Invoice ready"));
        System.out.println(notification.send("urgent", "sms", "Server down"));
        System.out.println("Problem: urgency types and delivery channels multiply condition combinations.");
    }
}
