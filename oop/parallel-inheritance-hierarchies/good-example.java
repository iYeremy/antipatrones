// Una sola jerarquia donde cada empleado sabe calcular su salario
abstract class Employee {
    public abstract double calculateSalary();
}

class Engineer extends Employee {
    public double calculateSalary() { return 3000; }
}

class Manager extends Employee {
    public double calculateSalary() { return 5000; }
}
