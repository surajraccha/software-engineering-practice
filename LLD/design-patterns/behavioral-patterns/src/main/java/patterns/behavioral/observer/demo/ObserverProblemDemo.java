package patterns.behavioral.observer.demo;

import patterns.behavioral.observer.problem.OrderObserverProblem;

public class ObserverProblemDemo {
    public static void main(String[] args) {
        System.out.println(new OrderObserverProblem().placeOrder("ORD-1"));
        System.out.println("Problem: order placement directly knows every side effect listener.");
    }
}
