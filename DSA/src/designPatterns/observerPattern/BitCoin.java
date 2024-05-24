package designPatterns.observerPattern;

public class BitCoin implements Payment{
    @Override
    public boolean processPayment() {
        System.out.print("bitcoin payment done");
        return true;
    }
}
