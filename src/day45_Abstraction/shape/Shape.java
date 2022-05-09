package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double are();

    public abstract double perimeter();

    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + are() + '\'' +
                ", perimeter='" + perimeter() + '\'';

    }



}
