package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        Processor processor = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));

        processor.log("ERROR", "Data not found !!");
        processor.log("DEBUG", "Data map is empty.");
        processor.log("INFO", "Data found.");
        processor.log("WARN", "Data found.");
    }
}
