package day14_String;

public class StringMethods5 {
    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();

        System.out.println(r);

        // this method is isEmpty. If your string "" is empty comes back as true.


        boolean r1= str.isBlank();
        // isBlank method is when in the string "" there is nothing but nothing else.

        // only difference between isEmpty and isBlack is that when there is white spaces in the string " "

        System.out.println(r1);


        String str2 = "Cydeo   ";

        System.out.println(str2.isBlank()); // false

        System.out.println("--------------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));  // false because the words are not the same A != a

        System.out.println(s1.equalsIgnoreCase(s2)); // this is true because it ignores the case A=a

        // yes, YES Yes, yES ....
        System.out.println("yEs".equals("YES")); //  False
        System.out.println("Yes".equalsIgnoreCase("yEs")); // true


        System.out.println("------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); // false
        System.out.println(hasCSharp);

        boolean hasJava = sentence.contains("Java"); // true
        System.out.println(hasJava);

        boolean hasJava2 = sentence.contains("java"); // false
        System.out.println(hasJava2);


       boolean hasJava3 = sentence.toLowerCase().contains("java"); // true
        System.out.println(hasJava3);

        boolean r3 = sentence.contains("java") || sentence.contains("Java"); // jAvA

        System.out.println(r3); // false


        System.out.println("------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false because they don't have the same number of characters

        System.out.println(input1.contains("Java")); // true because the string contains Java


        System.out.println(input1.toLowerCase().contains("java")); // true. this is the only way to ignore
                                                                // case sensitivity when you use contain method

        System.out.println(input1.toUpperCase().contains("JAVA")); // true


        System.out.println("----------------------------------------");


        String a = "Wooden Spoon";

        a.startsWith("Woo"); // you can give more than 1 character to find the result

        boolean x = a.startsWith("oo"); // false because the first character is W

        System.out.println(x);

        boolean y = a.endsWith("Spoon"); // true

        System.out.println(y);

        boolean z = a.toLowerCase().startsWith("wooden"); // in order to ignore the case sensitivity we first create
        // the lower case/upper case version of string and then compare it with lower/uppercase.

        System.out.println(z);






    }

}
