package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 5;

        /*
        if(number == 1){
        System.out.println("Monday");
         */

        switch (number){ // 1,2,3,4,5,6,7


            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block, same for all the other lines

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;


            default:
                System.out.println("Invalid"); // only gets executed if none of the case blocks are matching
               // break; because it's at the end you don't have to give this


        }
        /*
        Case value MUST match with switch data type and UNIQUE
        Switch Data can not be long, float, double and boolean data types
        break:used for exiting the switch
        if we don't give the break statement, switch continue to execute the next block(s) until the
        break statement or } of the switch
        default block it gets executed if none of the blocks are matching
         */

    }
}
