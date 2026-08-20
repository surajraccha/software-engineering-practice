package patterns.behavioral.command.demo;

import patterns.behavioral.command.problem.EditorCommandProblem;

public class CommandProblemDemo {
    public static void main(String[] args) {
        EditorCommandProblem editor = new EditorCommandProblem();
        System.out.println(editor.click("type", "Hello"));
        System.out.println(editor.click("clear", ""));
        System.out.println("Problem: button actions are hard-coded and cannot be queued, logged, or undone.");
    }
}
