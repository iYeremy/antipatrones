public class Registration {
    public void registerUser(User user) {
        // Validacion
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new RuntimeException("Invalid email");
        }
        if (user.getPassword().length() < 8) {
            throw new RuntimeException("Short password");
        }

        // Guardado
        System.out.println("Saving to DB...");
        // Logica compleja de base de datos aqui...

        // Notificacion
        System.out.println("Sending email to " + user.getEmail());
        // Logica de servidor de correo aqui...
    }
}
