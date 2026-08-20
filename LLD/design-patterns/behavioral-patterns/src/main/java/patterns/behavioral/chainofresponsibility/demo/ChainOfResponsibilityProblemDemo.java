package patterns.behavioral.chainofresponsibility.demo;

import patterns.behavioral.chainofresponsibility.problem.SupportChainProblem;

public class ChainOfResponsibilityProblemDemo {
    public static void main(String[] args) {
        SupportChainProblem support = new SupportChainProblem();
        System.out.println(support.handle("password"));
        System.out.println(support.handle("security"));
        System.out.println("Problem: one method knows every handler and routing rule.");
    }
}
