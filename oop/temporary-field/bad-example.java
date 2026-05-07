public class PriceCalculator {
    private double tempTax; // Solo se usa durante 1 segundo en calculate()

    public double calculate(double price) {
        tempTax = price * 0.15;
        return finalizePrice(price);
    }

    private double finalizePrice(double price) {
        return price + tempTax;
    }
}
