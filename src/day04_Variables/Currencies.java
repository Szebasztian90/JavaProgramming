package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 9.53;
        double euro = dollar * 1.16;
        double ron = dollar * 4.23;
        double jpy = dollar * 114.14;
        double peso = dollar * 12.67;
        double CAD = dollar * 1.24;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("ron = " + ron);
        System.out.println("jpy = " + jpy);
        System.out.println("peso = " + peso);
        System.out.println("CAD = " + CAD);

    }
}
