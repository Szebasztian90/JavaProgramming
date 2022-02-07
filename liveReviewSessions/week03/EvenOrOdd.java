package week03;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

    // Task: find if a given integer is even number or odd number
        // Hint: use % operator, and control flow statements

      int number = 199;


      boolean condition = number%2==0;
        if (condition){
            System.out.println(number +" is an even number.");
        }
        else {
            System.out.println(number + " is an odd number.");
        }



    }
}
