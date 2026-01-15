package DesignPatterns.prac.ChainOfResponsibility;

public abstract class Processor {
    private Processor nextProcessor;

    public Processor(Processor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public void log(String logLevel, String logMsg){
        if(nextProcessor == null){
            System.out.println("Appropriate Log level processor not found for logLevel and msg : " + logLevel + ": " + logMsg);
        }
        else{
            nextProcessor.log(logLevel, logMsg);
        }
    }
}