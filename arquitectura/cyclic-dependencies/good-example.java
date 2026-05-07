public interface Manager {
    String getName();
}

public class Employee implements Manager {
    public String getName() { return "John"; }
}

public class Department {
    private Manager manager;
    // Ahora Department depende de una interfaz, no de la clase Employee
    public Department(Manager m) { this.manager = m; }
}
