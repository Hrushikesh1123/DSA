package lld.foodApp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FoodApp
{

    private final ReentrantLock lock = new ReentrantLock();

    private static  FoodApp foodApp=null;
    List<User>users=new ArrayList<>();
    List<DeliveryPerson> persons=new ArrayList<>();

    public Order getOrderId(int id) {
        for(Order order:orders){
            if(order.getOrderId()==id){
                return order;
            }
        }
        return null;
    }

    public void setOrders(Order orders) {
        this.orders.add(orders);
    }

    List<Order>orders=new ArrayList<>();


    List<Restaurant>restaurants=new ArrayList<>();

    public  FoodApp(){
    }

    public static synchronized FoodApp getFoodApp(){
        if(foodApp==null) {
            foodApp = new FoodApp();
        }
        return foodApp;
    }

    public void setUser(List<User> userList){
        lock.lock();
        try {

            users.addAll(userList);
        }finally {
            lock.unlock();
        }
    }

    public void  addUser(User user){
        users.add(user);
    }

    public void updateUser(User user){
        lock.lock();
        try {
            for (User user1 : users) {
                if (user1.getId() == user.getId()) {
                    users.remove(user1);
                    users.add(user);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void updateRestaurant(Restaurant restaurant){
        lock.lock();
        try {
            for (Restaurant restaurant1 : restaurants) {
                if (restaurant1.getId() == restaurant.getId()) {
                    restaurants.remove(restaurant1);
                    restaurants.add(restaurant);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        lock.lock();
        try {
            this.restaurants = restaurants;

        }finally {
            lock.unlock();
        }
    }

    public int setLogin(User user){
        lock.lock();
        try {
            for (User user1 : users) {
                if (user.getEmailId() == user1.getEmailId() && user.getPassword() == user1.getPassword()) {
                    int index= users.indexOf(user1);
                    user1.setLoggedIn(true);
                    users.add(index,user1);
                    return user1.getId();
                }

            }
            return 0;
        }finally {
            lock.unlock();
        }
    }

    public Restaurant getRestaurantByName(String name){
        for(Restaurant restaurant:restaurants){
            if(restaurant.getName().equals(name)){
                return restaurant;
            }
        }
        return null;
    }

    public User getUser(int userId){
     for(User user1:users){
         if(user1.getId()==userId){
             return user1;
         }
     }
     return null;
    }

    public void updateUserOrderList(Order order,int userId){
        lock.lock();
        try{
            User user=getUser(userId);
            user.setOrder(order);
            updateUser(user);
            orders.add(order);
            Restaurant restaurant =getRestaurantById(order.getRestaurantId());
            restaurant.setPaymentDetails(order.getPaymentDetails());
            updateRestaurant(restaurant);
        }finally {
            lock.unlock();
        }
    }

    private Restaurant getRestaurantById(int restaurantId) {
        for(Restaurant restaurant:restaurants){
            if(restaurant.getId()==restaurantId){
                return restaurant;
            }
        }
        return null;
    }

    private DeliveryPerson getDeliveryPerson(){
       for(DeliveryPerson person:persons){
             if(person.getUserType()==UserType.DELIVERY_PERSON&&person.getCurrentStatus().equals(DeliveryPersonStatus.AVAILABLE)){
                return person;
             }
       }
       return null;
    }

    public void saveDetails(DeliveryPerson person) {
        lock.lock();
        try {
            for (DeliveryPerson deliveryPerson : persons) {
                if (deliveryPerson.getId() == person.getId()) {
                    persons.remove(deliveryPerson);
                    persons.add(person);
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
