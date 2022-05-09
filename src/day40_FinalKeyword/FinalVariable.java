package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

       final double pi = 3.14;

        //pi=4.14; unchangeable

        final String name;

        name = "Java";

        //name = "WoodenSpoon";

        System.out.println(name);

        System.out.println("----------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        System.out.println(obj.birthDay);

        System.out.println("----------------------------");


        System.out.println(FinalVariable.name);

    }
}