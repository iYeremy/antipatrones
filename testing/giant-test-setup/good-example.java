public class UserServiceTest {
    @BeforeEach
    public void setup() {
        // Setup enfocado: solo lo que la clase necesita para funcionar
        service = new UserService(mock(UserRepository.class));
    }
}
