package patterns.creational.prototype.demo;

import patterns.creational.prototype.problem.ReportTemplateProblem;
import patterns.creational.prototype.problem.ReportTemplateProblem.ReportTemplate;

public class PrototypeProblemDemo {
    public static void main(String[] args) {
        ReportTemplateProblem problem = new ReportTemplateProblem();

        ReportTemplate q1 = problem.createQuarterlyTemplate();
        ReportTemplate q2 = problem.manualCopyForNewQuarter(q1, "Quarterly Revenue Q2");

        q2.getChartSettings().changeCurrency("USD");

        System.out.println("Original: " + q1.describe());
        System.out.println("Copy: " + q2.describe());
        System.out.println("Problem: manual copying missed audit tags and shared the chart settings object.");
    }
}
