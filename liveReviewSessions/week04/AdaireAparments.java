package week04;

public class AdaireAparments {
    public static void main(String[] args) {

        System.out.println("######## WELCOME TO ADAIRE APARTMENTS #########");

        int numberOfBedrooms = 1;
        double startingPrice = 0;

        switch (numberOfBedrooms){
            case 0:
                System.out.println("You have selected studio apartment");
                startingPrice = 1454.0;
                break;
            case 1:
                    System.out.println("You have selected one bedroom apartment");
                    startingPrice = 1725.0;
                    break;
            case 2:
                System.out.println("You have selected two bedroom apartment");
                startingPrice = 2899.0;
                break;

            default:
                System.out.println(numberOfBedrooms + " bedroom apartment not available");

        }

        System.out.println("Starting prise: $ " + startingPrice);

    }

}
