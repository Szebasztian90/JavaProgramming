package week05;

import java.util.Scanner;

public class EmailCheckInterview {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please put a valid email address: test@example.com");

        String email = scan.next();

        boolean result = true;

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if (atSignIndex<1 || atSignIndex>=email.length()-3||atSignIndex!=email.lastIndexOf("@")){
            result = false;
        }
        if(dotIndex<1 || dotIndex == email.length()-1 || atSignIndex>dotIndex
        || atSignIndex+1==dotIndex){
            result=false;
        }
        System.out.println("result = " + result);


        /*System.out.println("Please enter your email: ");


        String email = scan.nextLine();

        int Index = email.indexOf("@");

        if(email.contains("@") && email.contains(".")
                && Index>0){
            System.out.println("true");
        }else{
            System.out.println("false");


        }

       scan.close();

         */




        /*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */
    }
}
