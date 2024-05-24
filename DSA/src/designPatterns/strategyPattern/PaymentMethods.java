package designPatterns.observerPattern;

public abstract class PaymentMethods {
    protected Payment payment;

    public boolean paymentProcess(){
        return payment.processPayment();
    }
}
