package patterns.structural.proxy.problem;

public class ReportProxyProblem {
    public String viewReport(String userRole) {
        ExpensiveReport report = new ExpensiveReport();
        if (!"admin".equals(userRole)) {
            return "Access denied";
        }
        return report.load();
    }

    static class ExpensiveReport {
        ExpensiveReport() {
            System.out.println("Opening expensive report connection");
        }

        String load() {
            return "Sensitive revenue report";
        }
    }
}
