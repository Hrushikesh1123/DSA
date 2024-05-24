package designPatterns.observerPattern;

public class Order extends PaymentMethods {

    public Order(Payment paymentType){
        this.payment=paymentType;
    }

}
