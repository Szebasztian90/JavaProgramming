package week09;

import java.util.Arrays;

public class R02_ArraysBinarySearchExample {
    public static void main(String[] args) {

        // find the biggest number in each array and store it to another one dimensional array
        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} }; // arr.length = 3 of {}

        // I want to print this 2d array at the console

        System.out.println(Arrays.deepToString(arr));

        int[] biggestNumbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i][0]; // this statement means first element of each array at index i

           for (int each : arr[i]){

               if(each>max){
                   max = each;
               }
           }

        biggestNumbers[i] = max;
        }

        System.out.println(Arrays.toString(biggestNumbers));

    }
}
