package lld.foodApp;

public class NotificationViaMail implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println(message + user.getId());
    }
}
