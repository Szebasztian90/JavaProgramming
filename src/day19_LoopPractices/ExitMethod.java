package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // i: 0, 1, 2, 3, 4 values that makes the condition true.

            if (i == 3){
             //   break; // terminates the loop
             //   continue; // terminates the current iteration of the loop (it will skip number 3)
                System.exit(0); // it terminates the program you run. Once the condition becomes true it will
                                        // stop running  (runs 0 1 2 )
            }
            System.out.println(i);

        }

        System.out.println("Wooden Spoon");


    }
}
