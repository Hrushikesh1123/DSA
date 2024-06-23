package lld.foodApp;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String emailId;
    int mobileNo;
    UserType userType;
    String firstName;
    String lastName;
    String password;
    boolean isLoggedIn;
    List<Order> orders=new ArrayList<>();
    PaymentMode paymentMode;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public void setOrder(Order order){
        orders.add(order);
    }


    public User(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public User(User user){
        this.id=user.getId();
        this.emailId=user.getEmailId();
        this.firstName=user.getFirstName();
        this.lastName=user.getLastName();
        this.password=user.getPassword();
        this.mobileNo=user.getMobileNo();
        this.paymentMode=user.getPaymentMode();
    }

    public User(int id, String emailId, int mobileNo, UserType userType, String firstName, String lastName, String password, PaymentMode paymentMode) {
        this.id = id;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.paymentMode = paymentMode;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
