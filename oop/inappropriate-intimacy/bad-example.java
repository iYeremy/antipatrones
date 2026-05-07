public class OrderHistory {
    public List<Order> orders = new ArrayList<>(); // Publico o accesible
}

public class Customer {
    private OrderHistory history;

    public void addOrder(Order o) {
        // Intimidad inapropiada: Customer manipula la lista interna de History
        history.orders.add(o);
    }
}
