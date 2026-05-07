public class Calculator {
    // Metodo para sumar dos numeros
    public int add(int a, int b) {
        // Retorna la suma de a y b
        return a + b;
    }

    public void process(User u) {
        // Verifica si el usuario es nulo
        if (u != null) {
            // Imprime el nombre
            System.out.println(u.getName());
        }
    }
}
