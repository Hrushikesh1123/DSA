package designPatterns.decoratorPattern;

public class EconomicCar implements CarRental{
    @Override
    public double cost() {
        return 12.0;
    }

    @Override
    public void description() {
        System.out.println("this is economic class");

    }
}
