package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public String getBookTitle(){
        return bookTitle;
    }

    public EncapsulationReview(String bookTitle, String publishDate) {
        this.publishDate = publishDate;
    }
}
