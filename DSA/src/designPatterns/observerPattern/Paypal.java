package designPatterns.observerPattern;

public class Paypal implements Payment {


    @Override
    public boolean processPayment() {
        System.out.println("payments are processed paypal");
        return true;
    }
}
