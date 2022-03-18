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


    // adds the given integer element to array, returns new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static double frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
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



