package day23_CustomMethods_Void;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(10); // the method demands additional info to complete its task. need a numbers ()

        System.out.println("----------------------------------------");

        ageOfPerson(1990);


    }



    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){ //10

        if(number % 2 == 0){
            System.out.println(number + " is even number.");
        }else{
            System.out.println(number + " is odd number.");
        }

    }


    // create a function that can display the age of a person
    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);

    }

    //                                                         10     50
    // create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){





    }

}
