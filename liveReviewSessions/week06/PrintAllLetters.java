package week06;

public class PrintAllLetters {
    public static void main(String[] args) {

        String ch = " ";

        for (int i = 65 ; i < 90 ; i++) {
            System.out.print((char)i+" ");

        }

        System.out.println("---------------------");

        for (char c = 'A'; c <='Z' ; c++) {
            System.out.print(c+" ");

        }

    }
}
