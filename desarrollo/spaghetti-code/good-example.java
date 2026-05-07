public class OrderProcessor {
    public void process(Order order) {
        if (isOrderInvalid(order)) return;

        double total = calculateTotal(order);
        applyDiscountIfApplicable(total);
        processPayment(total);
        handleShipping(order);
    }

    private boolean isOrderInvalid(Order order) {
        return order == null || order.getItems().isEmpty();
    }

    private double calculateTotal(Order order) {
        return order.getItems().stream().mapToDouble(Item::getPrice).sum();
    }

    private void processPayment(double total) {
        System.out.println("Processing payment for: " + total);
    }

    private void handleShipping(Order order) {
        if (order.getAddress() != null) {
            System.out.println("Shipping to: " + order.getAddress());
        }
    }
}
