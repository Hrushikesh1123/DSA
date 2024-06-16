package builderPattern;

public class ComputerBuilder {
    private String cpu;
    private Storage storage;
    private Ram ram;
    private String Gpu;

    private String powerSupply;

    private String acase;

    public String getCpu() {
        return cpu;
    }

    public Storage getStorage() {
        return storage;
    }

    public Ram getRam() {
        return ram;
    }

    public String getGpu() {
        return Gpu;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getCase() {
        return acase;
    }

      // new ComputerBuilder()


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setGpu(String gpu) {
        Gpu = gpu;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setCase(String aCase) {
        this.acase = aCase;
    }

    public  Computer build(){
        return new Computer(this);

    }
}
