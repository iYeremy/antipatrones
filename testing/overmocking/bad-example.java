public class UserTest {
    @Test
    public void testUserName() {
        // ERROR: Simular un objeto que solo guarda un String es innecesario
        User user = mock(User.class);
        when(user.getName()).thenReturn("John");
        
        assertEquals("John", user.getName());
    }
}
