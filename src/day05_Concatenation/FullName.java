package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Sebastian";
        String lastName = "Dulau";
        int age = 32;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);
        System.out.println();
        System.out.println("Full name of the person is " + fullName + "." + " He is " + age + " years old.");
        System.out.println();
        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + "'s salary is $" + salary + ".");



    }
}

// Full name of the person is ......