package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTile;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, int ID, String jobTile, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTile = jobTile;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTile='" + jobTile + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }


    public void work (){
        System.out.println(jobTile + " " + name + " is working");
    }


}
/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */