package lld.foodApp;

import java.util.List;

public abstract class RegistrationAppService extends AppInstance {

    private Notification notification;

    private Payment payment;


    public void setUser(List<User>userList){
        foodApp.setUser(userList);
    }

    public void setRestaurant(List<Restaurant> restaurants){
        foodApp.setRestaurants(restaurants);
    }


    //login
    //registerUser;
    //registerResta
    //logout



}
