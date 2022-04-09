package week13.inheritance;

public class BookClass {
    String title; //default access modifier
    String type;
    String author;
    double price;

    public BookClass(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public BookClass(){}

    public void buy(){
        System.out.println("Buy this product.");
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
