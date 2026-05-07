// Usando CompletableFuture para aplanar la logica (Java moderno)
public class OrderService {
    public void processOrder(Order order) {
        database.findUserAsync(order.userId)
            .thenCompose(user -> inventory.checkStockAsync(order.itemId))
            .thenCompose(available -> payment.chargeAsync(order.amount))
            .thenAccept(success -> System.out.println("Order complete"))
            .exceptionally(ex -> {
                System.err.println("Error: " + ex.getMessage());
                return null;
            });
    }
}
