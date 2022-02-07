package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        Create a class called MedianNumber. write a program that can find the median number
        between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
         */

        int a = 10;
        int b = 15;
        int c = 20;

        // if we have 3 different number, it meant one MUST be maximum, one MUST be minimum and one MUST be median



        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        in order for A to be the median  number:
            1. if C is the maximum number & B is the minimum number then A is the Median number
            2. if B is the maximum number & C is the minimum number then A is the Median number
                */


        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        /*
        in order for B to be the median  number:
            1. if C is the maximum number & A is the minimum number then B is the Median number
            2. if A is the maximum number & C is the minimum number then B is the Median number
                */


        boolean cIsMedian = !aIsMedian && !bIsMedian;
        /*
        in order for C to be the median  number:
            1. if A is the maximum number & B is the minimum number then C is the Median number
            2. if B is the maximum number & A is the minimum number then C is the Median number
                */


        if(aIsMedian) { // if a is the median number
            System.out.println(a + " is the Median Number");
        }

        if(bIsMedian){ // if b is the median number1
            System.out.println(b + " is the Median Number");
        }

        if(cIsMedian){ // if c is the median number
            System.out.println(c + " is the Median Number");
        }

    }
}
