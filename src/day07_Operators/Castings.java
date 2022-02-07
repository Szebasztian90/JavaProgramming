package day07_Operators;

public class Castings {

    public static void main(String[] args) {

float averageScore = 20.5f;

byte num1 = (byte)averageScore; // explicit casting
short num2 = (short)averageScore; // explicit casting
int num3 = (int)averageScore; // explicit casting
long num4 = (long)averageScore; // explicit casting
float num5 = averageScore; // no casting (no smaller nor larger primitive)
double num6 = averageScore; // implicit casting


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


        short x = 1000;
        long y = x;


        double scoreAverage = 50.0;

        byte num11 = (byte) scoreAverage;
        short num12 = (short) scoreAverage;
        int num13 = (int) scoreAverage;

        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);
        System.out.println("num13 = " + num13);






    /*
1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 implicit casting: casting smaller type to larger
 explicit casting: casting the larger type to smaller
 */



    }
}
