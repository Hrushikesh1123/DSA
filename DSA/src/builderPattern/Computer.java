package builderPattern;

public class Computer {
    private String cpu;
    private Storage storage;
    private Ram ram;
    private String Gpu;

    private String powerSupply;

    private String caseType;

    public String getCase() {
        return caseType;
    }

    public Computer(ComputerBuilder builder){
        this.caseType=builder.getCase();
        this.cpu= builder.getCpu();
        this.Gpu= builder.getGpu();
        this.ram=builder.getRam();
        this.storage=builder.getStorage();
        this.powerSupply= builder.getPowerSupply();

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                ", Gpu='" + Gpu + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", caseType='" + caseType + '\'' +
                '}';
    }
}
