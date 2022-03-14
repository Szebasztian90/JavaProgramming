package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints EACH CHARACTER of the given String.
    public static void printEachChar(String str){

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }

    // REVERSE the given string returns the reversed String.
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // checks if the given String is PALINDROME, returns boolean.
    public static boolean isPalindrome(String str){
      return reverse (str).equalsIgnoreCase(str);
    }

    // checks if the given String is ANAGRAM, returns boolean.
    public static boolean isAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      return Arrays.equals(ch1, ch2);

    }

    // remove the DUPLICATES from given string, returns String.
    public static String removeDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            char each = str.charAt(i);

            if(!result.contains("" + each)){
                result += each;
            }
        }
       return result;
    }



}

