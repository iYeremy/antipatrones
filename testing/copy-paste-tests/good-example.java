public class UserValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    @NullSource
    public void testInvalidNames(String name) {
        User u = createValidUser();
        u.setName(name);
        assertFalse(validator.isValid(u));
    }

    private User createValidUser() {
        User u = new User();
        u.setName("Valid");
        u.setEmail("test@test.com");
        return u;
    }
}
