package DesignPatterns.ChainOfResponsibilityDesignPattern;

/*

The Chain of Responsibility is a behavioral design pattern that passes a request along a chain of potential
handlers until one of them processes it. This pattern decouples the sender of a request from its receivers,
allowing multiple objects to have a chance to handle the request dynamically at runtime.

*/

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
