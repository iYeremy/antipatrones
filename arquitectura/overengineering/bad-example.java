public interface SumStrategy {
    int execute(int a, int b);
}

public class SimpleSumStrategy implements SumStrategy {
    public int execute(int a, int b) { return a + b; }
}

public class SumFactory {
    public static SumStrategy getStrategy() { return new SimpleSumStrategy(); }
}

public class Calculator {
    public int sum(int a, int b) {
        return SumFactory.getStrategy().execute(a, b);
    }
}
// Demasiado ruido para una suma.
