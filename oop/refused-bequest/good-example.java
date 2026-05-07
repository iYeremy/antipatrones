public interface Eater {
    void eat();
}

public interface Flyer {
    void fly();
}

public class Ostrich implements Eater {
    public void eat() { System.out.println("Eating..."); }
}

public class Eagle implements Eater, Flyer {
    public void eat() { System.out.println("Eating..."); }
    public void fly() { System.out.println("Flying..."); }
}
