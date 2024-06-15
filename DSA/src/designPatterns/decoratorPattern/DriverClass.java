package designPatterns.decoratorPattern;

public class DriverClass {

    public static void main(String[] args) {
        CarRental car=new EconomicCar();
        System.out.println(car.cost());
        car.description();
        //adding gps
        car=new Gps(car);
        System.out.println(car.cost());
        //adding Seat
        car = new Seat(car);
        System.out.println(car.cost());

    }

}
