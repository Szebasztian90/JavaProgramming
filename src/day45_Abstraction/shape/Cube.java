package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

    public Cube(String name) {
        super(name);
    }

    @Override
    public double are() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
