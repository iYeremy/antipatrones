public class Cart {
    public double calculateItemTotal(Item item) {
        // Envidia: Cart hace todo el trabajo usando datos de Item
        return (item.getPrice() * item.getQuantity()) - item.getDiscount();
    }
}
