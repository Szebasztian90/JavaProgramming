package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //Primitive: double > float > long > int > short > byte


        // Implicit Casting -> smaller primitives can be directly assigned to larger primitive type

        byte a = 100;
        short b = a;
        System.out.println(a + " : " + b);

        // short b = (short)a;
        //           (short)a

        int c = b; // implicit casting
        // int c = (int)b

        long d = c;
        //    (long)c

        float e = d;

        double f = e;

        System.out.println("----------------------------------------");

        // Explicit Casting -> larger primitives can NOT be directly assigned to smaller to primitive type (need to be casted manually

        int x = 55;
        short y = (short) x; // Explicit casting
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float) l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n; //10

        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println(f1 + " : " + l1);


    }
}
