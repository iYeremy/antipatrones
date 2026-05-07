public class UserTest {
    @Test
    public void testUserName() {
        // Usa el objeto real. Es mas simple, rapido y seguro.
        User user = new User("John");
        assertEquals("John", user.getName());
    }
}
