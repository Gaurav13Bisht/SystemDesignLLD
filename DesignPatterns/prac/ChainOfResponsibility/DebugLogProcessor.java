package DesignPatterns.prac.ChainOfResponsibility;

public class DebugLogProcessor extends Processor{

    public DebugLogProcessor(Processor nextProcessor){
        super(nextProcessor);
    }

    public void log(String logLevel, String logMsg){
        if("DEBUG".equals(logLevel)){
            System.out.println("DEBUG: " + logMsg);
        }
        else{
            super.log(logLevel, logMsg);
        }
    }
}