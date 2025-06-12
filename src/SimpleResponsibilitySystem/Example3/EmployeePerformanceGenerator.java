package SimpleResponsibilitySystem.Example3;

public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}
