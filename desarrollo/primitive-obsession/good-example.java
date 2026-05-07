public class Email {
    private final String value;

    public Email(String value) {
        if (!value.contains("@")) {
            throw new RuntimeException("Invalid email");
        }
        this.value = value;
    }

    public String getValue() { return value; }
}

public class UserService {
    public void updateEmail(int userId, Email email) {
        // El email ya es valido por definicion
        System.out.println("Updating to: " + email.getValue());
    }
}
