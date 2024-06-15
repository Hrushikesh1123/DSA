package designPatterns.decoratorPattern;

public abstract class CarDecorator implements CarRental {
    protected CarRental carRental;

    public CarDecorator(CarRental carRental){
        this.carRental=carRental;
    }
    @Override
    public double cost() {
        return  carRental.cost();
    }

    @Override
    public void description() {
         carRental.description();
    }

}
