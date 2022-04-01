package day01_JavaIntro;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] inhabitants = {scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt(), scan.nextInt(), scan.nextInt()};
        int dayCounter = 1;
        System.out.println("Day " + dayCounter++ + " " + Arrays.toString(inhabitants));

        for (int i = 0; i < inhabitants.length; i++) {
            boolean flag = true;

            for (int j = 0; j < inhabitants.length-1; j++) {
                if(inhabitants[j] == 0){
                    flag = false;
                }
            }
            if(flag){
                break;
            }

            if (inhabitants[i] == 0 && i != 0) {
                inhabitants[i - 1] /= 2;
            }

            if (inhabitants[i] == 0 && i != inhabitants.length - 1) {
                inhabitants[i + 1] /= 2;
            }

            if (i == inhabitants.length - 1) {
                i = 0;
                System.out.println("Day " + dayCounter++ + " " + Arrays.toString(inhabitants));
            }
            boolean flag2 = true;
            for (int j = 0; j < inhabitants.length; j++) {
                if(inhabitants[j] != 0 ){
                    flag2= false;
                }

            }

            if(flag2){
                System.out.println("Day " + dayCounter++ + " " + Arrays.toString(inhabitants));
                System.err.println("Extinction");
                break;
            }
        }

    }

}
