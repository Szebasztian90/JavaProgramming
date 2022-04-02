package week12;

public class Employee {

    public String name, jobTittle;
    public int ID;
    public double salary;

    //public Employee() { -> no parameter constructor

    public Employee(String name, String jobTittle, int ID, double salary) {
        this.name = name; //I'm getting a name from constructor and assigning it to
                         // the field of object that I'm creating.
        this.jobTittle = jobTittle;
        this.ID = ID;
        this.salary = salary;
    }

    public String asString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                ", ID=" + ID +
                ", salary= $" + salary +
                '}';
    }
}
/*
Employee:
    attribute
        name, jobTitle, ID, salary

    add a constructor to initialize all the fields

    asString()
 */