package day04_Variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        /* Crate a class named EmployeeInfo. Declare the following variables:
        1. name (String)
        2. age (int)
        3. gender (char)
        4. company (String)
        5. jobTitle (String)
        6. yearsOfExperience (double)
        7. salary (int)
        8. isFullTime (boolean)
        9. isMarried (boolean)
        10.employeeId (int)
         */

        String name = "Sebastian Dulau";
        int age = 32;
        char gender = 'M';
        String company = "LabTech";
        String jobTitle = "Security Manager";
        double yearsOfExperience = 12.5;
        int salary = 35000;
        boolean isFullTime = true;
        boolean isMarried = false;
        int employeeId = 6547;
        String SSN = "(123)-45-6789";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);
        System.out.println("gender = " + gender);


    }

}
