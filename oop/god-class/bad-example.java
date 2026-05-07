public class OrderProcessor {
    public void process(Order order) {
        // Validar stock (deberia hacerlo Inventory)
        if (order.items < 0) throw new RuntimeException();
        
        // Calcular impuestos (deberia hacerlo TaxCalculator)
        double tax = order.amount * 0.15;
        
        // Formatear mensaje (deberia hacerlo Formatter)
        String msg = "Order for " + order.user + " with tax " + tax;
        
        System.out.println(msg);
    }
}
// Las otras clases (Order, User, Inventory) son solo bolsas de datos.
