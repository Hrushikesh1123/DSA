package designPatterns.decoratorPattern;

public class Gps extends CarDecorator{
    public Gps(CarRental carRental) {
        super(carRental);
    }
    @Override
    public double cost() {
        return  super.cost()+11.0;
    }

    @Override
    public void description() {
        System.out.println("Gps equipment");

    }
}
