public class UserService {
    public void saveUser(User u) { /* ... */ }
}

public class PaymentProcessor {
    public void process(double amount) { /* ... */ }
}

public class Logger {
    public void log(String msg) { /* ... */ }
}

// Cada clase hace solo una cosa bien.
public class App {
    private UserService userService;
    private PaymentProcessor paymentProcessor;
    // ...
}
