public class OrderPoltergeist {
    // Esta clase solo sirve para llamar a otra, no hace nada mas
    public void process(Order o) {
        new RealProcessor().execute(o);
    }
}
