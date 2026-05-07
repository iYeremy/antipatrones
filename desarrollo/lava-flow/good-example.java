public class Calculator {
    public double calculate(double a, double b) {
        // La logica vieja ha sido validada, corregida y unificada
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
