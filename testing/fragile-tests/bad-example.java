public class LoginTest {
    @Test
    public void testLoginFailure() {
        String result = auth.login("user", "wrong");
        // Fragil: si el mensaje cambia a "Usuario no valido", el test rompe
        assertEquals("Error: invalid credentials, please try again.", result);
    }
}
