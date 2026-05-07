public class Bird {
    public void fly() { System.out.println("Flying..."); }
    public void eat() { System.out.println("Eating..."); }
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        // Herencia rechazada: un avestruz no vuela
        throw new UnsupportedOperationException("I can't fly!");
    }
}
