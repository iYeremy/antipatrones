public class AsyncTest {
    @Test
    public void testDataUpdate() {
        service.update();
        // Fragil: ¿Y si tarda 101ms?
        Thread.sleep(100); 
        assertTrue(service.isUpdated());
    }
}
