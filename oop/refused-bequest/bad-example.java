public class Bird {
    public void fly() { System.out.println("Flying..."); }
    public void eat() { System.out.println("Eating..."); }
}

public class Penguin extends Bird {
    @Override
    public void fly() {
        // Herencia rechazada: un pinguino no vuela
        throw new UnsupportedOperationException("I cant fly :(");
    }
}
