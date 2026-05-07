public class UserController {
    private UserService service;

    public void saveUser(User u) {
        service.register(u);
    }
}

public class UserService {
    private UserRepository repo;

    public void register(User u) {
        // La logica de negocio vive aqui
        if (u.name == null) throw new RuntimeException();
        repo.save(u);
    }
}
