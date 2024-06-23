package lld.foodApp;

public class DeliveryPerson extends User{
    String vehicleName;
    DeliveryPersonStatus currentStatus;

    Order currentOrder;


    public DeliveryPerson(User user,String vehicleName,DeliveryPersonStatus status) {
        super(user);
        this.currentStatus=status;

    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }


}
