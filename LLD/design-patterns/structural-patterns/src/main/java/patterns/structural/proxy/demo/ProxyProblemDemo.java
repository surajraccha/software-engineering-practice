package patterns.structural.proxy.demo;

import patterns.structural.proxy.problem.ReportProxyProblem;

public class ProxyProblemDemo {
    public static void main(String[] args) {
        ReportProxyProblem report = new ReportProxyProblem();
        System.out.println(report.viewReport("guest"));
        System.out.println(report.viewReport("admin"));
        System.out.println("Problem: expensive object is created before access control decides if it is needed.");
    }
}
