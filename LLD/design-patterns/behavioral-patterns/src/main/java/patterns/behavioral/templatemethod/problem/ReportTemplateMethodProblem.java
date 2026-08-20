package patterns.behavioral.templatemethod.problem;

public class ReportTemplateMethodProblem {
    public String export(String type) {
        if ("pdf".equals(type)) {
            return "load data -> format as pages -> write pdf";
        }
        if ("csv".equals(type)) {
            return "load data -> format as rows -> write csv";
        }
        return "unsupported export";
    }
}
