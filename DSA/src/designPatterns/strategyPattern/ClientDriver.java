package designPatterns.observerPattern;

public class ClientDriver {
    public static void main(String[] args) {
        Order order=new Order(new BitCoin());
        order.paymentProcess();
    }
}
