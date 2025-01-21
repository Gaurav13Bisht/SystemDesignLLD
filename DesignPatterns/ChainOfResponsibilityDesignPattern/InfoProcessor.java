package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class InfoProcessor extends Processor {

    public InfoProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void log(String logLevel, String logMsg){
        if(logLevel.equals("INFO")){
            System.out.println("LOG INFO: " + logMsg);
        }
        else{
            super.log(logLevel, logMsg);
        }
    }
}
