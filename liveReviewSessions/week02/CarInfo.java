package week02;

public class CarInfo {

    public static void main(String[] args) {

        // I want you to give example of the car that you will buy after you find a well payed job

        int year = 2022;
        String make = "Audi";
        String model = "RS6";
        // automatic = true; manual = false;
        boolean transmission = true;
        String color = "Black";
        int millage = 0;
        int price = 100_000; // for Europe

        System.out.println(year + " " + make + "  " + model + "\nAutomatic Transmission :" + transmission);
        System.out.println(color + "|" + millage + " kilometers |" + price + "Euros");

        // let's turn this value intro TL 1 Euro = 15,5 TL

        double priceInTL = price * 15.5;

        double taxRate = 1.80; // for this rate kind of cars

        double priceAfterTaxInnTL = priceInTL + (priceInTL * taxRate);
        System.out.println("priceAfterTaxInnTL = " + priceAfterTaxInnTL);

        // Variables are used, because it makes our data reusable and maintainable

    }
}
