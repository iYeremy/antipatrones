public class AsyncTest {
    @Test
    public void testDataUpdate() {
        service.update();
        // Robusto: espera hasta que la condicion se cumpla (con timeout)
        await().atMost(2, SECONDS).until(() -> service.isUpdated());
    }
}
