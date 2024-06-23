package lld.foodApp;

import java.util.List;

public class Order {
    int orderId;
    int restaurantId;
    int receiverId;
    int deliveredPersonId;
    OrderStatus orderStatus;
    PaymentDetails paymentDetails;
    double totalPrice;
    List<FoodMenu> orderList;


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }


    public Order(int orderId, int receiverId, int deliveredPersonId, OrderStatus orderStatus, List<FoodMenu> orderList,double totalPrice,int restaurantId) {
        this.orderId = orderId;
        this.receiverId = receiverId;
        this.deliveredPersonId = deliveredPersonId;
        this.orderStatus = orderStatus;
        this.orderList = orderList;
        this.totalPrice=totalPrice;
        this.restaurantId=restaurantId;
    }

    public int getDeliveredPersonId() {
        return deliveredPersonId;
    }

    public void setDeliveredPersonId(int deliveredPersonId) {
        this.deliveredPersonId = deliveredPersonId;
    }



    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public List<FoodMenu> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<FoodMenu> orderList) {
        this.orderList = orderList;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order Details{" +
                "orderId=" + orderId +
                ", receiverId=" + receiverId +
                ", deliveredPersonId=" + deliveredPersonId +
                ", orderStatus=" + orderStatus +
                ", paymentDetails=" + paymentDetails +
                ", totalPrice=" + totalPrice +
                ", orderList=" + orderList +
                '}';
    }
}
