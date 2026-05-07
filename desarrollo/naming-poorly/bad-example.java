public class ListManager {
    public void p(List<User> l) {
        for (User u : l) {
            if (u.s == 1) {
                // ¿Que estamos haciendo aqui?
                System.out.println(u.n);
            }
        }
    }
}
// En la clase User: int s; String n;
