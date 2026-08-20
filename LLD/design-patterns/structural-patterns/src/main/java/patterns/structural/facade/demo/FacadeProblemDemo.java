package patterns.structural.facade.demo;

import patterns.structural.facade.problem.VideoUploadProblem;

public class FacadeProblemDemo {
    public static void main(String[] args) {
        System.out.println(new VideoUploadProblem().upload("training.mp4"));
        System.out.println("Problem: client workflow depends on every subsystem step.");
    }
}
