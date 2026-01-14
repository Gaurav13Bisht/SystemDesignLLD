package DesignPatterns.BuilderDesignPattern;

public class main {
    public static void main(String[] args) {
        // Create a standard computer with only mandatory fields (using defaults for others)
        Computer standardComputer = new Computer.ComputerBuilder("Intel i5", "8GB")
                .build();
        System.out.println(standardComputer);

        // Create a gaming computer with all optional fields configured
        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 7", "32GB")
                .storage("1TB NVMe SSD")
                .hasGraphicsCard(true)
                .hasBluetooth(true)
                .build();
        System.out.println(gamingComputer);
    }
}
