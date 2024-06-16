package builderPattern;

public class Driver {
    public static void main(String[] args) {
        //get gaming computer
        ComputerBuilder computerBuilder=new ComputerBuilder();
        Computer gamingComputer=computerBuilder.setCase("cooler").build();

    }
}
