package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {
        /*
        System.out.println( true == !false); // true
        System.out.println( !true == false ); // false
        System.out.println( !false == true ); // true

        System.out.println( !!false ); // false
        System.out.println( !!!true ); // false
         */

/*
 score:
 90 ~ 100 ==> Excellent
 80 ~ 89 ==> Great
 70 ~ 79 ==> Good
 60 ~ 69 ==> Passed
 0 ~ 59 ==> Failed

 */

        int score = 85;

        boolean a = score >= 90 && score <= 100; // false

        boolean b = score >= 80 && score <= 89; // True
        //boolean b = score >= 80 && !a; if score is A, but score is greater than 80

        boolean c = score >= 70 && score <= 79; // False
        //boolean c = !a && !b && score >= 70;

        boolean d = score >= 60 && score <= 69; // False

        boolean f = score >= 0 && score <= 59; // False
        //boolean f = !a && !b && !c && !d;

        if (a) {// if student made an A
            System.out.println("Excellent");
        }

        if (b) { // if student made a B
            System.out.println("Great");
        }
        if (c) { // if student made a C
            System.out.println("Good");
        }
        if (d) { // if the student made a D
            System.out.println("Passed");
        }

        if (f) { // if student made F
            System.out.println("Failed");
        }





    }
}
