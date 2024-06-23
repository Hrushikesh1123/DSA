package lld.foodApp;

public class PaymentCard implements Payment{
    @Override
    public void processPayment() {
        System.out.println("payment done via upi");
    }
}
