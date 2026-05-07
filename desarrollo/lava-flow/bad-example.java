public class LegacyCalculator {
    public double calculate(double a, double b) {
        // Logica de 1998 que nadie entiende
        // NO BORRAR - Usado por el sistema de contabilidad viejo
        double res = a * 0.12345 / (b + 1); 
        return res;
    }
}

public class ModernCalculator {
    public double fastCalculate(double a, double b) {
        // Nueva logica, pero llama a la vieja "por si acaso"
        if (a < 0) return new LegacyCalculator().calculate(a, b);
        return a / b;
    }
}
