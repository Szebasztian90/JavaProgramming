package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {


        String str = "aaaaaaaaaaaaaabbbbbbbbbbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

    }
}