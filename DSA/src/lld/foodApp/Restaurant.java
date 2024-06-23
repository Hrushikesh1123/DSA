package lld.foodApp;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {


    int id;
    List<User> users=new ArrayList<>();
    List<FoodMenu> foodMenu= new ArrayList<>();
    String name;
    List<PaymentDetails>paymentDetails=new ArrayList<>();


    public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }


    public List<PaymentDetails> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails.add(paymentDetails);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<FoodMenu> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(List<FoodMenu> foodMenu) {
        this.foodMenu = foodMenu;
    }


}
