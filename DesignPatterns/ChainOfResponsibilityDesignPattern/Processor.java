package DesignPatterns.ChainOfResponsibilityDesignPattern;

public abstract class Processor {
    public Processor nextProcessor;

    public Processor(Processor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public void log(String logLevel, String logMsg){
        if(nextProcessor == null){
            System.out.println("Cant find matching handler/processor !!");
        }
        else{
            nextProcessor.log(logLevel, logMsg);
        }
    }

}
