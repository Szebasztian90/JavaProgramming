package day13_StringClass;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
             // index: 01234

        char thirdChar = word.charAt(2); // this is to find the letter in the ""

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);
             */


        System.out.println("-------------------------------------");

        String s1 = "Batch 25 is the best batch.Java Programming Language";

        int totalChars = s1.length(); // this is the total number in between the ""

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt( s1.length()-1 ); // this is the formula to find the last index number
        System.out.println("lastChar = " + lastChar);


        System.out.println("----------------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); // creates this "WOODEN SPOON" capital cases

        System.out.println(str);


        String s = "JAVA";
        s = s.toLowerCase(); // creates this "java" lover cases

        System.out.println(s);

        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";

        sentence = sentence.toUpperCase();
        System.out.println(sentence);


    }
}
