package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(); //empty ArrayList for our input (integer objects)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (input ends with 0) : ");

        int value;

        do{                         // line 19-24 reads the values of user with a loop
            value = input.nextInt();
            if(!list.contains(value) && value !=0 ){ //if Arraylist does not contain and not equal to zero
                list.add(value);
            }

        }while(value !=0);

        for (Integer numbers : list){
            System.out.print(numbers + " ");
        }
        System.out.println();

        //get the size of our array

        System.out.println("the size of our array " + list.size());

        //I want to sort my Array List



        //Collections Utility Class comes with many useful methods

        Collections.sort(list); //to sort your arraylist: in order to be able to use sort method your Object Class
                                // needs to be comparable

        System.out.println(list);

        // max and min numbers inside this arrayList
        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.shuffle(list); //random shuffle
        System.out.println(list);



    }


}


//it will get input from user and only will store distinct numbers to out ArrayList