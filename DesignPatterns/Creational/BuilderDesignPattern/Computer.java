package DesignPatterns.Creational.BuilderDesignPattern;

/*
Builder Pattern is helpful to create complex object having mix of mandatory and optional fields in a
clean and concise coding way which otherwise will need many constructors as per the fields combination(i.e. to give all mandatory fields + different number of optional fields).

It provides:
Flexibility – by decoupling the construction process from the actual object representation, the Builder Pattern allows us to create objects with varying configurations without cluttering our codebase with multiple constructors or setters
Readability – the Builder Pattern provides fluent interfaces, making our code more readable; this enables us and fellow developers to understand the construction process of complex objects at a glance.
Immutability (Optional) – builders can enforce immutability by creating immutable objects once the construction is complete; this ensures thread safety and prevents unintended modification.

Drawback: All fields need to be duplicated in Builder inner class so code duplicacy
*/


public class Computer {
    // Mandatory fields
    private final String CPU;
    private final String RAM;

    // Optional fields
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    private Computer(ComputerBuilder computerBuilder){
        this.CPU = computerBuilder.CPU;
        this.RAM = computerBuilder.RAM;
        this.storage = computerBuilder.storage;
        this.hasGraphicsCard = computerBuilder.hasGraphicsCard;
        this.hasBluetooth = computerBuilder.hasBluetooth;
    }

    // Can also use a static method like this to direct create object without using "new" keyword
    public static ComputerBuilder builder(String cpu, String ram) {
        return new ComputerBuilder(cpu, ram);
    }

    // Need to make it static because we want to create builder class's object without the need of
    // Computer class object since its defeat the purpose otherwise
    public static class ComputerBuilder{
        private final String CPU;
        private final String RAM;

        // Optional fields
        private String storage = "256 GB";
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        public ComputerBuilder(String CPU, String RAM){
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder storage(String storage){
            this.storage = storage;
            return this;
        }

        public ComputerBuilder hasGraphicsCard(boolean hasGraphicsCard){
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public ComputerBuilder hasBluetooth(boolean hasBluetooth){
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isHasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }
}