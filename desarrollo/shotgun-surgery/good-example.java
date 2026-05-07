public class CurrencyFormatter {
    public static String format(double amount) {
        return "$" + amount; // Unico lugar para cambiar
    }
}

public class Invoice {
    public void print(double amount) {
        System.out.println(CurrencyFormatter.format(amount));
    }
}

public class Receipt {
    public void show(double total) {
        System.out.println("Total: " + CurrencyFormatter.format(total));
    }
}
