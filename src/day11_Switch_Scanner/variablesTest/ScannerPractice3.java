package day11_Switch_Scanner.variablesTest;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");

        int score = input.nextInt(); // when you enter 85 and enter (the Enter button was taken by the next line)

        input.nextLine(); // this will take enter out

        System.out.println("Enter your full name");
        String fullName = input.nextLine();


        System.out.println("score = " + score);
        System.out.println("fullName = " + fullName);



    }
}
