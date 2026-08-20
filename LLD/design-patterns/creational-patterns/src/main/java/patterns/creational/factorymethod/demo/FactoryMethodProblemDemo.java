package patterns.creational.factorymethod.demo;

import patterns.creational.factorymethod.problem.LogisticsProblem;

public class FactoryMethodProblemDemo {
    public static void main(String[] args) {
        LogisticsProblem logistics = new LogisticsProblem();

        System.out.println(logistics.scheduleDelivery("truck", "books"));
        System.out.println(logistics.scheduleDelivery("ship", "furniture"));
        System.out.println(logistics.scheduleDelivery("drone", "medicine"));
        System.out.println("Problem: adding a new transport keeps changing the same scheduling method.");
    }
}
