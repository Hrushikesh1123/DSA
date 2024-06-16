package builderPattern;

public class ComputerBuilder {
    private String cpu;
    private Storage storage;
    private Ram ram;
    private String gpu;

    private String powerSupply;

    private String caseType;

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
        return gpu;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getCase() {
        return caseType;
    }

      // new ComputerBuilder()


    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuilder setCase(String caseType) {
        this.caseType = caseType;
        return this;
    }

    public  Computer build(){
        return new Computer(this);

    }
}
