package week04;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection == "drink") {
            System.out.println("drink option is selected");

            if (drinkItem == "tea") {
                System.out.println("Tea item selected");
            } else if (drinkItem == "coffee") {
                System.out.println("Coffee item is selected");
            }


        } else if (selection == "snack") {
            System.out.println("Snack Options is selected");

            if (snackItem == "chips") {
                System.out.println("Chips is selected");
            } else if (selection == "candy") {
                System.out.println("Candy is selected");
            }


        } else {
            System.err.println("INVALID ENTRY");
        }

        if(true)
            System.out.println("Hello");
            System.out.println("Running");


    }
}
