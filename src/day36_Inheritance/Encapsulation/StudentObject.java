package day36_Inheritance.Encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 26, 'M', 'A', "Cydeo");

        student1.setAge(32);
        System.out.println(student1);
    }
}
