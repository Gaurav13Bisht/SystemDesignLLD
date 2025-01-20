package LLDProblems.LoggingSystem;

public class ErrorProcessor extends Processor{

    public ErrorProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void log(String logLevel, String logMsg){
        if(logLevel.equals("ERROR")){
            System.out.println("LOG ERROR: " + logMsg);
        }
        else{
            super.log(logLevel, logMsg);
        }
    }
}
