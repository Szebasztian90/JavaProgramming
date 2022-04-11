package day38_Inheritance_MethodOverriding.carTask;

public class ParkingLot { // Parking lot HAS a toyota

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 2000, "Grey", 123456);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020, 67350, "Black", 2000);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
