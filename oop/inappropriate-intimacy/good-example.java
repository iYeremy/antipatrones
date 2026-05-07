public class OrderHistory {
    private final List<Order> orders = new ArrayList<>();

    public void register(Order o) {
        // La clase gestiona su propio estado
        this.orders.add(o);
    }
}

public class Customer {
    private OrderHistory history;

    public void addOrder(Order o) {
        // Customer usa la interfaz publica de History
        history.register(o);
    }
}
