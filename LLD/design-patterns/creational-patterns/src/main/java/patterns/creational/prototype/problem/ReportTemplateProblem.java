package patterns.creational.prototype.problem;

import java.util.ArrayList;
import java.util.List;

public class ReportTemplateProblem {
    public ReportTemplate createQuarterlyTemplate() {
        ReportTemplate template = new ReportTemplate("Quarterly Revenue", "finance");
        template.setChartSettings(new ChartSettings("bar", "INR", true));
        template.addSection("Summary");
        template.addSection("Revenue by region");
        template.addSection("Risk notes");
        template.addAuditTag("approved-template");
        return template;
    }

    public ReportTemplate manualCopyForNewQuarter(ReportTemplate source, String newTitle) {
        ReportTemplate copy = new ReportTemplate(newTitle, source.getDepartment());
        copy.setChartSettings(source.getChartSettings());

        for (String section : source.getSections()) {
            copy.addSection(section);
        }

        return copy;
    }

    public static class ReportTemplate {
        private final String title;
        private final String department;
        private ChartSettings chartSettings;
        private final List<String> sections = new ArrayList<>();
        private final List<String> auditTags = new ArrayList<>();

        public ReportTemplate(String title, String department) {
            this.title = title;
            this.department = department;
        }

        public void setChartSettings(ChartSettings chartSettings) {
            this.chartSettings = chartSettings;
        }

        public ChartSettings getChartSettings() {
            return chartSettings;
        }

        public String getDepartment() {
            return department;
        }

        public void addSection(String section) {
            sections.add(section);
        }

        public List<String> getSections() {
            return sections;
        }

        public void addAuditTag(String auditTag) {
            auditTags.add(auditTag);
        }

        public String describe() {
            return title + " | " + department + " | sections=" + sections + " | chart=" + chartSettings.describe()
                    + " | auditTags=" + auditTags;
        }
    }

    public static class ChartSettings {
        private final String type;
        private String currency;
        private final boolean legendVisible;

        public ChartSettings(String type, String currency, boolean legendVisible) {
            this.type = type;
            this.currency = currency;
            this.legendVisible = legendVisible;
        }

        public void changeCurrency(String currency) {
            this.currency = currency;
        }

        public String describe() {
            return type + "/" + currency + "/legend=" + legendVisible;
        }
    }
}
