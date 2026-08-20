package patterns.behavioral.observer.problem;

public class OrderObserverProblem {
    public String placeOrder(String orderId) {
        String email = "Email sent for " + orderId;
        String inventory = "Inventory reserved for " + orderId;
        String analytics = "Analytics tracked for " + orderId;
        return email + " | " + inventory + " | " + analytics;
    }
}
