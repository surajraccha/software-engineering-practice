package patterns.behavioral.state.demo;

import patterns.behavioral.state.problem.DocumentStateProblem;

public class StateProblemDemo {
    public static void main(String[] args) {
        DocumentStateProblem document = new DocumentStateProblem();
        System.out.println(document.publish());
        System.out.println(document.publish());
        System.out.println("Problem: state transitions are conditionals inside the document.");
    }
}
