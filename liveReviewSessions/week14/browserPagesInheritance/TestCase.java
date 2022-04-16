package week14.browserPagesInheritance;

import day37_Inheritance.scrumTask.ProductOwner;

public class TestCase {
    public static void main(String[] args) {

        //if I want to use fields and methods of Browser Class: do I have to create an object from browser class?
        // Can I also reach with child class object>

        AmazonHomePage amazonHomePage = new AmazonHomePage("Chrome");

        System.out.println("I am automating: " + amazonHomePage.getName());
        System.out.println("My operating system is: " + Browser.getOSName());// use class name for static field

        amazonHomePage.navigateTo("www.amazon.com");

        amazonHomePage.navigateTo("Search for laptops");

        amazonHomePage.shopFor("Samsung PC");

        //Can I use amazonHomePage object to reach ProductPage shopFor method

        PageProduct productObject = new PageProduct("Chrome", 2 );
       String product = amazonHomePage.product;
       productObject.shopFor(product);

       //navigate the Cart: I can use both objects
        // productObject.navigateTo("Cart"); we can use all well child class object
        amazonHomePage.navigateTo("Cart");

        CartPage cartPage = new CartPage("Chrome", "Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(456322455);

        cartPage.setName("FireFox");
        cartPage.closeBrowser();

        cartPage.setName("FireFox");
        System.out.println("I am automating: " + cartPage.getName());
        System.out.println("I am automating: " + amazonHomePage.getName());
    }
}
/*
Let's create a Test Case together:
      1. I need to set my browser and OS type
      2. Navigate to App's Page
      3. navigate to laptops and select Samsung PC
      4. Go to product's page, buy 2 of them, add to cart
      5. Go to cart, fill all the fields and order
 */