package patterns.behavioral.iterator.problem;

import java.util.List;

public class PlaylistIteratorProblem {
    private final List<String> songs = List.of("Intro", "Design Patterns", "Outro");

    public String songAt(int index) {
        return songs.get(index);
    }

    public int size() {
        return songs.size();
    }
}
