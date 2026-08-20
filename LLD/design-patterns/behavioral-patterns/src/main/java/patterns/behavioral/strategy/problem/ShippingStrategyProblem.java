package patterns.behavioral.strategy.problem;

public class ShippingStrategyProblem {
    public int cost(String type, int distance) {
        if ("standard".equals(type)) {
            return distance * 5;
        }
        if ("express".equals(type)) {
            return distance * 10 + 100;
        }
        if ("pickup".equals(type)) {
            return 0;
        }
        return -1;
    }
}
