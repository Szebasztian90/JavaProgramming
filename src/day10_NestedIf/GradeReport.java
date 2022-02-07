package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
           90~100: Excellent
           80~89: Great
           70~79: Good
           60~69: Passed
           0~59: Failed
          */
        int grade = 95;



        if (grade >= 0 && grade <= 100) { // if the score is valid (0 ~ 100)

        if (grade >=90){ //false if < 90
            System.out.println("Excellent");
        }else if (grade >=80){ // false if < 80
            System.out.println("Great");
        }else if(grade >= 70){ // false if < 70
            System.out.println("Good");
        }else if (grade >= 60){ // false if < 60
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        }else{// if the score is not valid
            System.out.println("Invalid Grade");

        }

        System.out.println("----------------------------------");


           String result = "";

        if (grade >= 0 && grade <= 100) {

            if (grade >= 90) { //false if < 90
                result = "Excellent";
            } else if (grade >= 80) { // false if < 80
                result = "Great";
            } else if (grade >= 70) { // false if < 70
                result = "Good";
            } else if (grade >= 60) { // false if < 60
                result = "Passed";
            } else {
                result = "Failed";
            }

          }else{// if the score is not valid
            result = "Invalid Grade";
        }

        System.out.println( result);


    }
}
