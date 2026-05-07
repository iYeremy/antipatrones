public class StringUtils {
    // Reintentando la rueda: capitalizar manualmente
    public String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
