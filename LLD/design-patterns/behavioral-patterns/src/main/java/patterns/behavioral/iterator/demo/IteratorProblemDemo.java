package patterns.behavioral.iterator.demo;

import patterns.behavioral.iterator.problem.PlaylistIteratorProblem;

public class IteratorProblemDemo {
    public static void main(String[] args) {
        PlaylistIteratorProblem playlist = new PlaylistIteratorProblem();
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.songAt(i));
        }
        System.out.println("Problem: traversal depends on indexes and exposes collection shape.");
    }
}
