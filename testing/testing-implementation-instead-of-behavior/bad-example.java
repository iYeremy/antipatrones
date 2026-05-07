public class SorterTest {
    @Test
    public void testSort() {
        Sorter sorter = new Sorter();
        sorter.sort(list);
        // Mal: verificando detalles internos (como se hizo)
        verify(sorter, times(1)).useQuickSortAlgorithm();
    }
}
