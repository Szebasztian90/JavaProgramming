package week09;

public class CombineStrings {
    public static void main(String[] args) {


        System.out.println(combineStrings ("abc","defg"));





    }

    private static String combineStrings(String str1, String str2) {

        String combine = "";

        int biggestSize = str1.length() >= str2.length()? str1.length() : str2.length();

        for(int i = 0; i < biggestSize; i++){
            if (i < str1.length()){
                combine += str1.charAt(i);
            }
            if (i<str2.length()){
                combine += str2.charAt(i);
            }
        }

        return combine; //
    }
}
/*
  Write a method/function that will take two String and combine them
    Ex:
        Input: "java", "apple"
        Output: "jaapvpale"

        // jaapvpale
       */

