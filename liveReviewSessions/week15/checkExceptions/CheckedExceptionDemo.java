package week15.checkExceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

       // Thread.sleep(5000); //throws or causes an interrupted exception, which is a checked exception
        //1. Try Catch

        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("I will move on with my web automation");

        //2. Declare using the Throw Keyword
        Thread.sleep(5000);
        System.out.println("More automation after 5 more seconds");


    }
}
