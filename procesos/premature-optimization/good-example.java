public class Logger {
    public void log(String msg) {
        // Simple y legible. El compilador moderno ya optimiza esto.
        System.out.println(System.currentTimeMillis() + ": " + msg);
    }
}
