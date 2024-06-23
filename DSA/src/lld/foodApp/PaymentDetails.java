package lld.foodApp;

public class PaymentDetails {
    int id;
    int senderId;
    int receiverId;
    double totalPrice;
    PaymentMode paymentMode;
    PaymentStatus paymentStatus;

    public PaymentDetails(int senderId, int id, int receiverId, double totalPrice, PaymentStatus paymentStatus, PaymentMode paymentMode) {
        this.senderId = senderId;
        this.id = id;
        this.receiverId = receiverId;
        this.totalPrice = totalPrice;
        this.paymentStatus = paymentStatus;
        this.paymentMode = paymentMode;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
