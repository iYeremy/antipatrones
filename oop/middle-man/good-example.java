public class Department {
    private Manager manager;
    
    public Manager getManager() {
        return manager;
    }
}

public class Client {
    public void process(Department dept) {
        // El cliente habla directamente con el manager
        System.out.println(dept.getManager().getName());
    }
}
