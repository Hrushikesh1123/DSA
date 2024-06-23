package lld.foodApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  abstract class CustomerAppService extends AppInstance implements LoginInterface{

  private Random random=new Random();

    public int login(String emailId,String password){
       int id=foodApp.setLogin(new User(emailId,password));
       System.out.println("logged in user id " + id);
       return id;
    }

    public Order orderFood(String foodName ,int quantity,String restaurantName,int userId){

        Restaurant restaurant=foodApp.getRestaurantByName(restaurantName);
        User user=foodApp.getUser(userId);
        FoodMenu food=FoodMenu.getFoodByName(restaurant.getFoodMenu(),foodName);
        double totalPrice=food.getFoodPrize()*quantity;
        List<FoodMenu>menu=new ArrayList<>();
        menu.add(food);
        Order order=new Order(random.nextInt(),userId,0,OrderStatus.PENDING,menu,totalPrice,restaurant.getId());
        updateOrderInUserAndRestaurant(order,userId);
          return order;
    }

    private void updateOrderInUserAndRestaurant(Order order,int userId) {
           foodApp.updateUserOrderList(order,userId);
    }

    public void makePayment(int userId,int orderId){
        User user=foodApp.getUser(userId);
        payment=PaymentFactory.getPaymentMode(user.getPaymentMode());
        payment.processPayment();
        Order order =foodApp.getOrderId(orderId);
        PaymentDetails paymentDetails=new PaymentDetails(userId,random.nextInt(),order.getRestaurantId(),order.getTotalPrice(),PaymentStatus.COMPLETED,user.getPaymentMode());
        order.setPaymentDetails(paymentDetails);
        updateOrderInUserAndRestaurant(order,userId);

    }

}
