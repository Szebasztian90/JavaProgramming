package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines.
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }


    // prints each DOUBLE of the double array in separate lines.
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }


    // prints each CHAR of the char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each STRING of the string array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    // find the MAXIMUM number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }



    // find the MAXIMUM number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    // find the MINIMUM number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    // find the MINIMUM number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    // check if the given INTEGER is contained in the given array. returns boolean. contains (int[], int)
    public static boolean contains(int[] array, int element){
        // {1,2,3,4}      find if 6 is contained in the array
        boolean result = false;

        for (int each : array) {
            if(each == element){ // if any arrays' element is matching with the given element, it means that
                                // the given element is contained in the array
                result = true;
            }
        }
        return result;
    }

    // check if the given DOUBLE is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }


    //check if the given CHAR is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }


    //check if the given STRING is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }



    //merger
    //addElements
    //removeElements
    //reverse
    //clear
    //frequency OfElement
    //uniqueElement
    //removeDuplicates





}



