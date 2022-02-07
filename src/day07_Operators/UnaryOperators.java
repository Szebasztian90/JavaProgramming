package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {



        int num1 = 25; // this is a positive number, you don't have to add the + only if you want to

        int num2 = -25; // this is a negative number, it is mandatory to add the -

        System.out.println(num1 < 0); // this is false
        System.out.println(num2 < 0); // this is true

        System.out.println("----------------------");

int a = 5;
++a; // it is pre increment: => increases the value by 1 right away

        System.out.println(a); // ==> 6

        --a; //  it is a pre decrement =>  will decrease the value by 1 right away

        System.out.println(a); // ==> 5



        int b = 100;

        System.out.println(++b); // pre increment : increases the value by 1

        int c = 100;

        System.out.println(c++); // this is a post increment: this will post pond the value. it means it will not change right away the value

        System.out.println(c);  // this time it will increase the number ==> 101

        int x = 200;

        System.out.println(--x); // pre decrement, means it will decrease the value by 1 right away

int y = 200;


        System.out.println(y--); // post decrement: first passes the current value, then decreases the value by 1

        System.out.println(y);


int z = 45;

        System.out.println(++z); // pre increment ==> increases the value right away ==> 46
        System.out.println(z++); // post increment ==> increases the value after this line ==> 46
        System.out.println(z); // this is when it will increase the value from the above command ==>47

        int q = 30;

        System.out.println(--q); // pre decrement ==> will decrease the value right away ==> 29
        System.out.println(q--); // pro decrement ==> will decrease the value later ==> 29
        System.out.println(q); // this is when it will decrease the value from the above command 28




    }
}
