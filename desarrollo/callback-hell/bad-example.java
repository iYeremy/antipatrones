public class OrderService {
    public void processOrder(Order order) {
        database.findUser(order.userId, user -> {
            inventory.checkStock(order.itemId, available -> {
                if (available) {
                    payment.charge(user, order.amount, success -> {
                        if (success) {
                            System.out.println("Order complete");
                        }
                    });
                }
            });
        });
    }
}
