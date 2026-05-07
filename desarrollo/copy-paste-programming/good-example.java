public class ReportGenerator {
    public void generatePdfReport(Data data) {
        String content = formatData(data);
        System.out.println("Generating PDF with content: " + content);
    }

    public void generateHtmlReport(Data data) {
        String content = formatData(data);
        System.out.println("Generating HTML with content: " + content);
    }

    private String formatData(Data data) {
        return "=== REPORT ===\n" + data.toString() + "\n==============\n";
    }
}
