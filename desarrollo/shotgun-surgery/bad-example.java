// Si queremos cambiar el simbolo "$" a "USD", debemos editar todas estas clases
public class Invoice {
    public void print(double amount) {
        System.out.println("$" + amount);
    }
}

public class Receipt {
    public void show(double total) {
        System.out.println("Total: $" + total);
    }
}
