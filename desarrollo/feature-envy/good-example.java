public class Item {
    private double price;
    private int quantity;
    private double discount;

    public double getTotal() {
        return (price * quantity) - discount;
    }
}

public class Cart {
    public double calculateItemTotal(Item item) {
        // Ahora Cart solo le dice a Item que haga su trabajo
        return item.getTotal();
    }
}
