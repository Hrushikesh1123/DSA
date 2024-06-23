package lld.foodApp;

import java.util.List;

public class FoodMenu {
    int id;
    String foodName;
    boolean isVeg;
    double foodPrize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public double getFoodPrize() {
        return foodPrize;
    }

    public void setFoodPrize(double foodPrize) {
        this.foodPrize = foodPrize;
    }

    public FoodMenu(int id, String foodName, boolean isVeg, double foodPrize) {
        this.id = id;
        this.foodName = foodName;
        this.isVeg = isVeg;
        this.foodPrize = foodPrize;
    }

    public  static FoodMenu getFoodByName(List<FoodMenu> foodMenu, String foodName){
        for(FoodMenu foodMenu1:foodMenu){
            if(foodMenu1.getFoodName().equals(foodName))
            {
                return foodMenu1;
            }
        }
        return null;
    }
}
