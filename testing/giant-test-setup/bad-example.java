public class UserServiceTest {
    @BeforeEach
    public void setup() {
        // Setup gigante e innecesario para un test de nombre
        db = new Database("localhost", 5432, "root", "pass");
        emailServer = new EmailServer("smtp.test.com");
        paymentProcessor = new PaymentProcessor(db, emailServer);
        service = new UserService(db, emailServer, paymentProcessor);
        // ... mas lineas
    }
}
