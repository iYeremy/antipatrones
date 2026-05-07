public class Client {
    public void printCity(User user) {
        // Cadena de mensajes: el cliente conoce toda la estructura
        String city = user.getAddress().getRegion().getCity().getName();
        System.out.println(city);
    }
}
