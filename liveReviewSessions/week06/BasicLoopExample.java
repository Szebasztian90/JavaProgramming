package week06;

public class BasicLoopExample {
    public static void main(String[] args) {

/*
Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000

int i=0: initialization
i<1000: condition
i+=10: iteration

 */
        for (int i = 0; i <= 1000; i+=10) { // i: local variable works only inside the for loop
            System.out.print(i+" ");
        }

        System.out.println();

        //=========================

        int z =0;
        for( ; z<=1000; ){
            if(z%10==0) {
                System.out.print(z + " ");
            }//  z=+10;
        z++;

        }

//if we make the initialization outside the for loop, the variable z can be used within the entire class.
// Or when the initialization is made within the for loop as usual, then the z only belongs to the loop


/*
Question-2:

         Write a program that
         displays all odd numbers between 3-130
         in the same line

 */

        for (int i=3; i<130; i +=2){
            System.out.print(i+ " ");
        }

        System.out.println();

/*
          Question-3:

            Write a program that displays
            the number of even numbers between 5 and 50 (included)
I am asking How Many
         */

    int countOfEven =0;
    for (int i=5; i<=50; i++){

        if(i%2==0){
            ++countOfEven;
        }
    }

        System.out.println("Count Of Even numbers = " + countOfEven);


        System.out.println();



        int j = 1;
        for ( ; j<10; j++ ){

            System.out.println("12 x " + j + " = " + (12*j));
        }









    }
}
