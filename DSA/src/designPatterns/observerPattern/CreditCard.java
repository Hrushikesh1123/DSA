package designPatterns.observerPattern;

public class CreditCard implements Payment{


    @Override
    public boolean processPayment() {
        System.out.println("payment processed through creditcard");
        return true;
    }
}
