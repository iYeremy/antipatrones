public class Employee {
    private Department dept;
    public Employee(Department d) { this.dept = d; }
}

public class Department {
    private Employee manager;
    public Department(Employee e) { this.manager = e; }
}
// Circulo vicioso.
