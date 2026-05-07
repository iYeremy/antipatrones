public class PriceCalculator {
    public double calculate(double price) {
        double tax = price * 0.15;
        return finalizePrice(price, tax);
    }

    private double finalizePrice(double price, double tax) {
        return price + tax;
    }
}
