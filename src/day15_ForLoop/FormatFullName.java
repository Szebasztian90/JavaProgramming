package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";

     // firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                        //c                       ydeo ==> "Cydeo"


        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
        // to return the char as a string you need to add "" +

        System.out.println(firstName);

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String fullName = firstName + " "+ lastName;
        System.out.println("fullName = " + fullName);



        /*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format
(first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */
    }
}
