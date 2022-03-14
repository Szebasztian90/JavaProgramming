package utilities;

public class StringUtility {

    // prints EACH CHARACTER of the given String
    public static void printEachChar(String str){

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }

    // REVERSE the given string returns the reversed String
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }


}

