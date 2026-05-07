public class ImageProcessor {
    public void processJpeg(byte[] data) {
        System.out.println("Processing JPEG...");
    }

    // "Ancla": Nadie usa PNG, pero lo dejamos por si acaso
    public void processPng(byte[] data) {
        // Logica compleja que requiere una libreria externa pesada
        System.out.println("Processing PNG...");
    }
}
