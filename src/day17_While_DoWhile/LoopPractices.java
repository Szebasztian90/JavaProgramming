package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {  // for this type of requirement you will go with this
            System.out.println(i);
        }


        System.out.println("------------------------------------------------");
        int j=1;

        while (j <= 10){
            System.out.println(j);
            j++;
        }

        System.out.println("--------------------------------------------------");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while(k <=10);

    }
}
