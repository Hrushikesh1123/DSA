package builderPattern;

public class Driver {
    public static void main(String[] args) {
        //get gaming computer
        ComputerBuilder computerBuilder=new ComputerBuilder();
        Computer gamingComputer=computerBuilder.setCase("cooler").setCpu("INTEL I7").setRam(Ram.GB_16).setPowerSupply("728w").setStorage(Storage.TB_1024).build();
        System.out.println(gamingComputer.toString());

    }
}
