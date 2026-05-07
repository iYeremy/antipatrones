public class UserValidatorTest {
    @Test
    public void testEmptyName() {
        User u = new User();
        u.setName("");
        u.setEmail("test@test.com");
        assertFalse(validator.isValid(u));
    }

    @Test
    public void testNullName() {
        User u = new User();
        u.setName(null);
        u.setEmail("test@test.com");
        assertFalse(validator.isValid(u));
    }
}
