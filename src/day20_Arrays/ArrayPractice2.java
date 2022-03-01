package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char [26];

        /*
        letters [0] = 'A';
        letters [1] = 'B';
         */

       /* for(char i='A', j=0; i <='Z' && j< letters.length; i++, j++){ // i: -> represents the index numbers 0~last index
            letters[j] = i;                                           // j: -> represents the number of counting []

        }
        */
        char ch = 'A';
        for(int i=0; i < letters.length; i++){
            letters[i]=ch++;
        }

        System.out.println(Arrays.toString(letters)); // [A~Z]


        System.out.println("---------------------------------------");

        char [] letters2 = new char[26];

        for (char i = 'Z', j=0; j < letters2.length; i--, j++) {
            letters2[j] = i;

        }
        System.out.println(Arrays.toString(letters2));


    }
}
