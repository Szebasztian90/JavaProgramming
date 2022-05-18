package week18.poly_demo2;

public class ElementsTest {
    public static void main(String[] args) {

        Links links = new Links(); // No poly, It reaches implementation of the methods from links class
        links.click();
        links.getText();
        links.sendKeys("Eu8");
        links.getLinkHref();

        WebElement loginLink = new Links();
        loginLink.click(); //Dynamic Poly-Dynamic Binding

    }

}
