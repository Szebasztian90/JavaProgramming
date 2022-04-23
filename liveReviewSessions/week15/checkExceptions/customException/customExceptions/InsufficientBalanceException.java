package week15.checkExceptions.customException.customExceptions;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(){}

    public InsufficientBalanceException(String message){super(message);}



}
