package day17_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i == 'C'){
                continue; // this is to skip

            }
            System.out.println(i);

        }


        System.out.println("-----------------------------------------");

        // print all even numbers between 1~10S

        for (int i = 1; i < 11; i++) {
            if (i%2!=0){ // 1, 3, 5, 7, 9
                continue; // Skip the odd numbers
            }
            System.out.println(i);
        }





        System.out.println("-----------------------------------------");

        // print all odd numbers between 1~10S

        for (int i = 1; i < 11 ; i++) {
            if (i%2 == 0){ // 2, 4, 6, 8, 10
                continue; // skip the even numbers
            }
            System.out.println(i);
        }

    }
}
