package patterns.structural.composite.problem;

import java.util.List;

public class FileTreeProblem {
    public int sizeOf(Object node) {
        if (node instanceof FileItem file) {
            return file.size();
        }
        if (node instanceof Folder folder) {
            int total = 0;
            for (Object child : folder.children()) {
                total += sizeOf(child);
            }
            return total;
        }
        return 0;
    }

    public record FileItem(String name, int size) {
    }

    public record Folder(String name, List<Object> children) {
    }
}
