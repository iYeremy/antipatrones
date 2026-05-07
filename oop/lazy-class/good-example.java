public class User {
    private String address;

    public void setAddress(String address) {
        // La validacion simple se queda en el propio objeto
        if (address == null || address.isEmpty()) throw new RuntimeException();
        this.address = address;
    }
}
