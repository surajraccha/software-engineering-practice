package patterns.behavioral.strategy.demo;

import patterns.behavioral.strategy.problem.ShippingStrategyProblem;

public class StrategyProblemDemo {
    public static void main(String[] args) {
        ShippingStrategyProblem shipping = new ShippingStrategyProblem();
        System.out.println("Express cost: " + shipping.cost("express", 20));
        System.out.println("Problem: each new shipping algorithm changes the same method.");
    }
}
