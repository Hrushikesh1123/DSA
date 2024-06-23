package lld.foodApp;

public class PaymentUpi implements Payment{
    @Override
    public void processPayment() {
        System.out.println("payment done via upi");
    }
}
