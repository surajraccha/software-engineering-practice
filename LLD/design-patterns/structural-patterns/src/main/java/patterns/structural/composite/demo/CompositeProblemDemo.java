package patterns.structural.composite.demo;

import java.util.List;
import patterns.structural.composite.problem.FileTreeProblem;
import patterns.structural.composite.problem.FileTreeProblem.FileItem;
import patterns.structural.composite.problem.FileTreeProblem.Folder;

public class CompositeProblemDemo {
    public static void main(String[] args) {
        Folder root = new Folder("project", List.of(
                new FileItem("README.md", 2),
                new Folder("src", List.of(new FileItem("Main.java", 8)))
        ));
        System.out.println("Size: " + new FileTreeProblem().sizeOf(root));
        System.out.println("Problem: client code checks whether each node is a file or folder.");
    }
}
