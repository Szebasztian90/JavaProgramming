package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("-----------------------------");

        helloCydeo5Times();
    }

    // create a function that can print hello word 5 times ===> helloWorld5Times()
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }




    // create a function that can print hello Cydeo 5 times ===> helloCydeo5Times()
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }

}
