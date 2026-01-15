package DesignPatterns.prac.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Processor logProcessor = new InfoLogProcessor(new DebugLogProcessor(null));
        logProcessor.log("INFO", "API called !");
        logProcessor.log("DEBUG", "API response received !");
        logProcessor.log("ERROR", "API call failed !");
    }
}
