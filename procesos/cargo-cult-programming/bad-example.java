public class MySimpleApp {
    public void run() {
        // Cargo Cult: Usar un sistema de logs complejo, inyeccion de dependencias
        // y fabricas para imprimir un "Hola Mundo".
        ServiceFactory.getService(PrintService.class).execute("Hello");
    }
}
