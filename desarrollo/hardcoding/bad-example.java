public class DatabaseConnector {
    public void connect() {
        // Valores fijos que fallaran en produccion
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String pass = "123456";
        
        System.out.println("Connecting to " + url + " with user " + user);
    }
}
