package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        String str = "aaaaaaaaaaaaaabbbbbbbbbbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);


        String name = "Java Programming";

       String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);

        System.out.println("--------------------------");

        int[] intArray = new int[10];
        for (int i = 0; i <= intArray.length-1; i++) {
            if( i % 2 ==0){
                intArray[i]= i;

            }else{
                intArray[i] =i;
            }
            System.out.println(Arrays.toString(intArray));

        }


























    }
}