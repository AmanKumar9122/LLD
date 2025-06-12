package OpenClosedPrinciple.Example3.BetterCode;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public String generate() {
        return "PDF report";
    }
}
