public class ComputerBuilder {
    private String CustomerName;
    private String CPU;
    private int RamSize;
    private int StorageSize;
    private String Processor;

    public String getCustomerName() { return CustomerName; }
    public String getCPU() { return CPU; }
    public int getRamSize() { return RamSize; }
    public int getStorageSize() { return StorageSize; }
    public String getProcessor() { return Processor; }

    public ComputerBuilder(String CustomerName){
        this.CustomerName = CustomerName;
    }
    public ComputerBuilder SetCpu(String CPU){
        this.CPU = CPU;
        return this;
    }
    public ComputerBuilder SetRamSize(int RamSize){
        this.RamSize = RamSize;
        return this;
    }
    public ComputerBuilder SetStorageSize(int StorageSize){
        this.StorageSize = StorageSize;
        return this;
    }
    public ComputerBuilder SetProcessor (String Processor){
        this.Processor = Processor;
        return this;
    }

    public Computer Build(){
        return  new Computer(this);
    }
}
