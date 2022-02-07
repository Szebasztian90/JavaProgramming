package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        // This is the short and easy way!

        String name = "Sebastian Dulau",
                buildingNumber = "64",
                streetName = "Major Road",
                city = "London",
                state = "UK",
                postCode = "E15 1EH";


/* This is the longer way to do it
        String name = "Sebastian Dulau";
        String buildingNumber = "64";
        String streetName = "Major Road";
        String city = "London";
        String state = "UK";
        String postCode = "E15 1EH";
*/
        //    System.out.println(name + "\n" + buildingNumber + " " + " " + streetName + "\n" + city + ", " + state + "\n" + postCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city +
                ", " + state + "\n" + postCode;
        System.out.println(address);


    }


}
