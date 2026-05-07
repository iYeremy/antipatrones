public class DocumentPrinter {
    // ¿Que hace true? ¿Que hace false?
    public void print(String text, boolean isFancy) {
        if (isFancy) {
            System.out.println("Printing with colors and fonts: " + text);
        } else {
            System.out.println("Printing plain text: " + text);
        }
    }
}
