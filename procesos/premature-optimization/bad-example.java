public class Logger {
    public void log(String msg) {
        // Optimizacion prematura: usar Bitwise o estructuras complejas
        // para algo que un String simple resuelve bien.
        StringBuilder sb = new StringBuilder(1024);
        sb.append(System.currentTimeMillis()).append(": ").append(msg);
        System.out.println(sb.toString());
    }
}
