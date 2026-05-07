public class LoginTest {
    @Test
    public void testLoginFailure() {
        String result = auth.login("user", "wrong");
        // Robusto: comprobamos la intencion, no el formato exacto
        assertTrue(result.toLowerCase().contains("error"));
    }
}
