package patterns.behavioral.memento.demo;

import patterns.behavioral.memento.problem.TextEditorMementoProblem;

public class MementoProblemDemo {
    public static void main(String[] args) {
        TextEditorMementoProblem editor = new TextEditorMementoProblem();
        editor.type("first ");
        editor.type("second");
        editor.restore("");
        System.out.println(editor.content());
        System.out.println("Problem: restore state is exposed as plain data and can be corrupted by callers.");
    }
}
