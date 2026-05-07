public class Calculator {
    private static final double TAX_RATE = 0.16;
    private static final double FLAT_DISCOUNT = 10.0;

    public double calculateTotal(double price) {
        double taxAmount = price * TAX_RATE;
        return (price + taxAmount) - FLAT_DISCOUNT;
    }
}
