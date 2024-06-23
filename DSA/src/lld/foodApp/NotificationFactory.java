package lld.foodApp;

public abstract class NotificationFactory {

    public static Notification getNotification(String type){
        if(type.equals("sms")){
            return new NotificationViaSMS();
        }
        else{
            return new NotificationViaMail();
        }
    }


}
