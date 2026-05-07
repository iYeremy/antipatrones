public class AppManager {
    // Demasiadas responsabilidades en una sola clase
    public void saveUser(User u) { /* DB logic */ }
    public void logError(String err) { /* Log logic */ }
    public void processPayment(double amount) { /* Payment logic */ }
    public void renderUI() { /* UI logic */ }
    public void sendEmail(String msg) { /* Email logic */ }
    public void validateInput(String in) { /* Validation logic */ }
}
