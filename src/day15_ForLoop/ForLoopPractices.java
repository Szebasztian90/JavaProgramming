package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {


        for (int i = 15; i <= 45; i++ ) { // i:15, 16, 17, 18, ........ 45

            System.out.print(i+ " ");

        }

        System.out.println(); // after the for loop you need to give an empty line to write
        System.out.println("Hello");


        // 100 ~50

        for (int s = 100; s >=50; s-- ){ // operators used a lot in the for loop <= >= < >

            System.out.print(s+ " ");

        }

        System.out.println();
        System.out.println("------------------");

    // print all the even numbers between 1~55
        for (int a = 1; a <= 55; a ++ ) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for (int i = 2; i<=54; i +=2){

            System.out.print(i+ " " );
        }

        System.out.println();
        System.out.println("------------------------------");

        for (char in = 'a'; in <= 'z'; in++  ){

            System.out.print(in+ " ");
        }





    }

}
