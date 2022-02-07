package day03_EscapeSequences;

/*

Escape sequences: Must be given with double quote

\n - Starts a Newline
Advances the cursor to the next line for subsequent printing

\t - Horizontal Tab (paragraph space)
Causes the cursor to skip over to the next tab stop.

\\ - Backslash
Causes a backslash to be printed. (1 backslash written)

\" - Double quote
Causes a double quotation mark to be printed

 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------");

        System.out.println(" \tJava is cool Programming Language");

        System.out.println("---------------------------------------");

        System.out.println("/\\"); // in order to print 1 backward slash we need to write two backward slash

        System.out.println("---------------------------------------");

        System.out.println("My favorite TV show is \"Game of Throne\""); // in order to print double code we need to use double sequance


    }


}
