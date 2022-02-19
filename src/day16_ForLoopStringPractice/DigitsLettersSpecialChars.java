package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {


        String str = "ABCDE  1234567$%^&*$%££$ABC DSssssrjksfhsd";


        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i);// ch: is every character in the string str

            if(ch >='0' && ch <= '9'){ // if the character is between character '0' to '9' == digit
                digits +=ch;
            }else if (ch>='A' && ch<='Z'){ // if the character is between 'A' to 'Z' then it is a letter
                letters += ch;
            }else if (ch>='a' && ch<='z'){// if the character is between 'a' to 'z' then it is a letter
                letters += ch;
            }else { // if the characters it not digit nor letter, then it's special character
                if (ch != ' ') { // if special character is not a space " "


                    specialChars += ch;
                }
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);








    }
}
