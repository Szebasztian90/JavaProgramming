package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {

        //age:38 years old

        byte age = 38;

        // weight 160 pounds
        // byte weight = 160; 160 is out of byte' range

        // byte num = -129; // -129 is out of byte' range

        short wight = 160; // 160 is within the range of short

        // salary: 100000 $
        // short salary = 100000; // 100000 is out of short' rage
        int salary = 100_000; // int is the preferred data type for integer number

        long asset = 3_333_333_333L; // This is how to declare the long with an L

        //tax: 0.26
        float tax = 0.26F; // when use the float use F at the end of the number

        double PI = 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char grade = 'F';
        System.out.println("grade = " + grade);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        boolean isEmployeed = false;
        System.out.println(yesNo);

        boolean isMarried = false;
        System.out.println("isMarried = " + isMarried);

        boolean result = 100 > 300;
        System.out.println("result = " + result);

        String name = "Wooden Spoon"; // String\; sequence of characters, use for more than one character

        System.out.println("name = " + name);
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";


    }


}
