// Usando un patron de eventos complejo para una simple validacion
public class Validator {
    public void validate(String input) {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.register(new ValidationListener());
        dispatcher.dispatch(new ValidationEvent(input));
    }
}
// Demasiada infraestructura para algo tan simple.
