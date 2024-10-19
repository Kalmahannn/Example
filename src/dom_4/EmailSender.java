package dom_4;

public class EmailSender implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsSender implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

