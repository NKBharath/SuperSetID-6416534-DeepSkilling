public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder("Bharath")
                            .SetCpu("Intel").SetRamSize(16)
                            .SetStorageSize(2048).SetProcessor("Intel I9").Build();
        System.out.println(computer);
    }
}