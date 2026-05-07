public class UserService {
    public void updateEmail(int userId, String email) {
        if (!email.contains("@")) {
            throw new RuntimeException("Invalid email");
        }
        // Guardar email...
    }

    public void sendNotification(String email) {
        if (!email.contains("@")) {
            throw new RuntimeException("Invalid email");
        }
        // Enviar...
    }
}
