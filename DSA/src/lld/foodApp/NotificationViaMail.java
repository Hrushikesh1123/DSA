package lld.foodApp;

public class NotificationViaMail implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("sending via mail");
    }
}
