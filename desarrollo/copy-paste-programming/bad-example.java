public class ReportGenerator {
    public void generatePdfReport(Data data) {
        // Logica para formatear datos
        String header = "=== REPORT ===\n";
        String footer = "==============\n";
        String content = header + data.toString() + "\n" + footer;
        
        System.out.println("Generating PDF with content: " + content);
    }

    public void generateHtmlReport(Data data) {
        // Logica para formatear datos (COPIADA)
        String header = "=== REPORT ===\n";
        String footer = "==============\n";
        String content = header + data.toString() + "\n" + footer;
        
        System.out.println("Generating HTML with content: " + content);
    }
}
