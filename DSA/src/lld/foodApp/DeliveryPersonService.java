package lld.foodApp;

public abstract class DeliveryPersonService extends AppInstance implements LoginInterface
{

    public int login(String emailId,String password){
        int id=foodApp.setLogin(new User(emailId,password));
        System.out.println("logged in user id " + id);
        return id;
    }

    public void getAssignedForOrder(int orderId,int userId){
        notification=NotificationFactory.getNotification("sms");
        Order order=foodApp.getOrderId(orderId);
        User user = foodApp.getUser(order.getReceiverId());
        notification.sendNotification(user,"order is on the way" );
        DeliveryPerson person= (DeliveryPerson) foodApp.getUser(userId);
        person.setOrder(order);
        person.setCurrentStatus(DeliveryPersonStatus.NOT_AVAILABLE);
        foodApp.saveDetails(person);
        order.setOrderStatus(OrderStatus.DELIVERED);
        notification.sendNotification(user,"order is delivered" );
        foodApp.updateUserOrderList(order,user.getId());
    }


}
