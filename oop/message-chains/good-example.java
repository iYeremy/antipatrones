public class User {
    private Address address;

    // Delegacion: el cliente no necesita saber como se llega a la ciudad
    public String getCityName() {
        return address.getCityName();
    }
}

public class Client {
    public void printCity(User user) {
        System.out.println(user.getCityName());
    }
}
