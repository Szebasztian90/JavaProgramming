package day01_JavaIntro;

public class Practice1 {
    public static void main(String[] args) {
        int a =0;
        do{
            System.out.println("a" + a);

            a = a++ + --a - (a % 3);

            System.out.println(a);

        }while(++a <4);

        System.out.println(a);
    }
}
