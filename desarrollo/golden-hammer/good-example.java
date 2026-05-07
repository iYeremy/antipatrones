// Solucion directa y adecuada al problema
public class Validator {
    public void validate(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input is empty");
        }
    }
}
