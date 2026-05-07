public class OrderProcessor {
    public void process(Order order) {
        if (order != null) {
            if (order.getItems().size() > 0) {
                double total = 0;
                for (Item item : order.getItems()) {
                    total += item.getPrice();
                }
                if (total > 100) {
                    total = total * 0.9;
                }
                // Mas logica mezclada aqui...
                System.out.println("Processing payment for: " + total);
                if (order.getAddress() != null) {
                    System.out.println("Shipping to: " + order.getAddress());
                } else {
                    System.out.println("No address provided");
                }
            }
        }
    }
}
