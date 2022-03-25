package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    //                      "BMW"               "X5"              "Black"
    public void setInfo(String carBRand, String carModel, String carColor, int carYear, double carPrice){

        brand = carBRand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }

    public void start(){
        System.out.println(brand+model+ " has started.");
    }

    public void stop(){
        System.out.println(brand+model+" has stopped.");
    }



}
/*
Car:
Attributes:
brand, model, color, year, price

Actions:
drive(), start(), stop(), toString(), setInfo()

CarObjects:
create 3 objects of car
 */