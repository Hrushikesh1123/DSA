package lld.foodApp;

public abstract class PaymentFactory {


    public static Payment getPaymentMode(PaymentMode mode){
        if(PaymentMode.UPI==mode){
            return new PaymentUpi();
        }
        return new PaymentCard();
    }

}
