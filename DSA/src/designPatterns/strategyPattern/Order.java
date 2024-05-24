package designPatterns.observerPattern;

public class Order extends PaymentMethods {
    PaymentMethods paymentMethods;
    public Order(Payment paymentType){
        this.payment=paymentType;
    }

}
