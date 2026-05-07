public class Department {
    private Manager manager;

    // Middle Man: este metodo solo delega, no aporta nada
    public String getManagerName() {
        return manager.getName();
    }
}
