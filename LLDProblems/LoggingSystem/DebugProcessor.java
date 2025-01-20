package LLDProblems.LoggingSystem;

public class DebugProcessor extends Processor{

    public DebugProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void log(String logLevel, String logMsg){
        if(logLevel.equals("DEBUG")){
            System.out.println("LOG DEBUG: " + logMsg);
        }
        else{
            super.log(logLevel, logMsg);
        }
    }
}
