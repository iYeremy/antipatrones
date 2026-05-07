public class UserService {
    public void welcomeUser(String name) {
        // Esta variable se calcula pero nunca se usa
        String prefix = "User: " + name;
        
        System.out.println("Hello " + name);
    }

    // Este metodo ya no se llama desde ningun lugar
    private void oldValidationMethod() {
        System.out.println("Validating legacy data...");
    }
}
