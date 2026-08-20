package patterns.behavioral.templatemethod.demo;

import patterns.behavioral.templatemethod.problem.ReportTemplateMethodProblem;

public class TemplateMethodProblemDemo {
    public static void main(String[] args) {
        ReportTemplateMethodProblem report = new ReportTemplateMethodProblem();
        System.out.println(report.export("pdf"));
        System.out.println(report.export("csv"));
        System.out.println("Problem: shared algorithm steps are duplicated across export branches.");
    }
}
