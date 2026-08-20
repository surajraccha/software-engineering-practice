package patterns.behavioral.visitor.demo;

import java.util.List;
import patterns.behavioral.visitor.problem.DocumentVisitorProblem;
import patterns.behavioral.visitor.problem.DocumentVisitorProblem.Heading;
import patterns.behavioral.visitor.problem.DocumentVisitorProblem.Paragraph;

public class VisitorProblemDemo {
    public static void main(String[] args) {
        DocumentVisitorProblem document = new DocumentVisitorProblem();
        System.out.println(document.exportMarkdown(List.of(new Heading("Notes"), new Paragraph("Practice visitor."))));
        System.out.println("Problem: every new operation repeats type checks across document elements.");
    }
}
