package day45_Abstraction.shape;

public class Square extends Shape{

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }


    @Override
    public double are() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                this.toString()+
                "side=" + side +
                '}';
    }
}
