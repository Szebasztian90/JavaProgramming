package day04_Variables;

public class Circle {
    public static final double radius = 10;

    public static void main(String[] args) {

        // PI, radius, diameter, area, perimeter


        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2; // finds the diameter by multiplying the radius to 2
        double area = radius * radius * PI; // finds the area of the circle
        double perimeter = diameter * PI; // finds the perimeter of the circle

        System.out.println("radius = "+ radius);
        //System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        int a1 = 100;
        int b2 = 200;
        boolean aIsGreaterThenB = a1 > b2;
        System.out.println(aIsGreaterThenB);

        System.out.println("------------------");
        int a = 100;
        double b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----------------------------");
        double c = 20.5;
        int d = (int) c;
        System.out.println(c);
        System.out.println(d);

    }
}
