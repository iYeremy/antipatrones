public class OrderProcessor {
    private final TaxCalculator taxCalculator;
    private final Inventory inventory;

    public OrderProcessor(TaxCalculator tc, Inventory inv) {
        this.taxCalculator = tc;
        this.inventory = inv;
    }

    public void process(Order order) {
        inventory.checkStock(order);
        double total = taxCalculator.applyTaxes(order.getAmount());
        System.out.println(order.formatSummary(total));
    }
}
// La logica esta distribuida y cada objeto sabe que hacer.
