public class UserController {
    private UserRepository repo;

    public void saveUser(User u) {
        // ERROR: El controlador hace logica de negocio y accede a DB
        if (u.name == null) throw new RuntimeException();
        repo.save(u);
    }
}
