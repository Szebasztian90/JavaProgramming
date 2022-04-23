package week15.checkExceptions.customException.customExceptions;

public class BreakTimeException extends RuntimeException {
    public BreakTimeException(String message){
        super(message); // call the constructor of RunTimeException class
    }

}
