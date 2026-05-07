public class DatabaseConnector {
    public void connect() {
        // Los valores se obtienen de una fuente externa
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String pass = System.getenv("DB_PASS");
        
        System.out.println("Connecting to " + url);
    }
}
