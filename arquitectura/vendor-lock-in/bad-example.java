import com.amazon.aws.sns.AmazonSNS; // Dependencia directa

public class NotificationService {
    private AmazonSNS client; // Pegado a AWS

    public void send(String msg) {
        client.publish("topic", msg);
    }
}
