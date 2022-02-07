package week03;

public class UnaryReview {
    public static void main(String[] args) {

        int a = 20;

        System.out.println("a++ = " + a++);//20
        System.out.println("a = " + a); //21

        int b = 20;
        System.out.println("++b = " + ++b); // 21

        int c = 20;
        System.out.println(++c + 1); //22

        boolean isMarried = true;
        System.out.println("isMarried = " + !isMarried); // not operator


        int x = 12;

        if(++x>12){ // pre- increment
            System.out.println("x in the if statement part : " + x);
        }else{
            System.out.println("x value in the ELSE statement : " + x);
        }







        int y = 12;

        if(y++>12){ // post - increment
            System.out.println("Y in the if statement part : " + y);
        }else{
            System.out.println("Y value in the ELSE statement : " + y);
        }




    }
}
