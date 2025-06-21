public class Computer {
    private String CustomerName;
    private String CPU;
    private int RamSize;
    private int StorageSize;
    private String Processor;

    public Computer(ComputerBuilder builder){
        this.CustomerName = builder.getCustomerName();
        this.CPU = builder.getCPU();
        this.RamSize = builder.getRamSize();
        this.StorageSize = builder.getStorageSize();
        this.Processor = builder.getProcessor();
    }
    public String toString(){
        return "Details:\n"+
                "Customer Name "+CustomerName+"\n"+
                "CPU "+CPU+"\n"+
                "Ram Size "+RamSize+"\n"+
                "Storage Size"+StorageSize+"\n"+
                "Processor "+Processor+"\n";
    }
}
