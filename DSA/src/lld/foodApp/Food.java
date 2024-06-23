package lld.foodApp;

public class Food {
    String foodName;
    int quantity;
    int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public Food(String foodName, int quantity, int Price) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.totalPrice =Price*quantity;
    }

}
