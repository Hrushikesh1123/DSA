package designPatterns.decoratorPattern;

public class Seat extends CarDecorator{
    public Seat(CarRental carRental) {
        super(carRental);
    }

    @Override
    public double cost() {
        return  super.cost()+11.0;
    }

    @Override
    public void description() {
        carRental.description();
    }
}
