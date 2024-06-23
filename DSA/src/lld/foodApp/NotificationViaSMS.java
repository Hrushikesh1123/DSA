package lld.foodApp;

public class NotificationViaSMS implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("sending notification via sms");
    }
}
