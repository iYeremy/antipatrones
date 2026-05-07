public class SorterTest {
    @Test
    public void testSort() {
        Sorter sorter = new Sorter();
        List<Integer> result = sorter.sort(Arrays.asList(3, 1, 2));
        // Bien: verificando el resultado (que se hizo)
        assertEquals(Arrays.asList(1, 2, 3), result);
    }
}
