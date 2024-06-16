package builderPattern;

public class Computer {
    private String cpu;
    private Storage storage;
    private Ram ram;
    private String Gpu;

    private String powerSupply;

    private String Case;

    public String getCase() {
        return Case;
    }

    public Computer(ComputerBuilder builder){
        this.Case=builder.getCase();
        this.cpu= builder.getCpu();
        this.Gpu= builder.getGpu();
        this.ram=builder.getRam();
        this.storage=builder.getStorage();
        this.powerSupply= builder.getPowerSupply();

    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public String getGpu() {
        return Gpu;
    }

    public void setGpu(String gpu) {
        Gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
}
