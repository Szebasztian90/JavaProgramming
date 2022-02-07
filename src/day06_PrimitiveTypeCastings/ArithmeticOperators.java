package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); // 121. this is called concatenation

        System.out.println(10+20); //30 this is called addition
        System.out.println(100-50); //50 this is called subtraction
        System.out.println(10*6); // 50 this is called multiplication


        System.out.println(100 / 3); //33
        System.out.println(10.0/4); //2
        System.out.println(10/4.0);
        System.out.println(10d/4); // add letter D for decimals and you will get 2.5

        int a = 100;
        double b = a/6; //16.0
        //double b = 16;

        System.out.println(b);

        double c = (double)a/6.0; //16.66666

        System.out.println(c);

        System.out.println( 100D);
        System.out.println(10%3);

        System.out.println(45.0/8);
        System.out.println(45%8);

        /*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */


    }
}
