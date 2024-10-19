package practica_4;

public interface INotification {
    void sendNotification(String message);
}

class EmailNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}

