package DesignPatterns.prac.ChainOfResponsibility;

public class InfoLogProcessor extends Processor{

    public InfoLogProcessor(Processor nextProcessor){
        super(nextProcessor);
    }

    public void log(String logLevel, String logMsg){
        if("INFO".equals(logLevel)){
            System.out.println("INFO: " + logMsg);
        }
        else{
            super.log(logLevel, logMsg);
        }
    }
}