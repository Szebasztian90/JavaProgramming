package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F', 'B', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("---------------------------------------");

        sumOfNumbers(10, 20, 30, 40);
    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumber(double num1, double num2){
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;

    }
}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */