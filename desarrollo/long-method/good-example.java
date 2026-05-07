public class Registration {
    public void registerUser(User user) {
        validateUser(user);
        saveToDatabase(user);
        sendWelcomeEmail(user);
    }

    private void validateUser(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new RuntimeException("Invalid email");
        }
        if (user.getPassword().length() < 8) {
            throw new RuntimeException("Short password");
        }
    }

    private void saveToDatabase(User user) {
        System.out.println("Saving to DB...");
    }

    private void sendWelcomeEmail(User user) {
        System.out.println("Sending email to " + user.getEmail());
    }
}
