package week13.inheritance;

public class BookShop {
    public static void main(String[] args) {

        BookClass bookOne = new BookClass();
        bookOne.title ="Intro to Java";
        bookOne.author = "Savitch";
     bookOne.type = "Programmming";
     bookOne.price = 85.90;

        System.out.println("bookOne = " + bookOne);

        AudioBook audioBook = new AudioBook("Selenium Cookbook","Automation","Unmesh",44.99,60,"Irina");

audioBook.listen();
audioBook.buy();


    }
}
