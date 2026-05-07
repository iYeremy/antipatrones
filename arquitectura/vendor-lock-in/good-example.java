public interface MessageSender {
    void send(String msg);
}

public class NotificationService {
    private MessageSender sender;

    public void send(String msg) {
        sender.send(msg);
    }
}
// Ahora MessageSender puede ser AWS, Google o un sistema propio.
