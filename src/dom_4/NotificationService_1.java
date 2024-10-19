package dom_4;

public class NotificationService_1 {
    private INotificationSender notificationSender;

    public NotificationService_1(INotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.send(message);
    }
}

