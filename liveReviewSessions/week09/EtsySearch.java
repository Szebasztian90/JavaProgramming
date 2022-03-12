package week09;

public class EtsySearch {
    public static void main(String[] args) {

        System.out.println("--Starting UI Automation for Etsy WebSite----");

        openBrowser("Chrome");

        navigateToUrl("https://www.etsy.com");

        searchForItem("Java");

        if(verifyItemIsDisplay().equals("Pass")){
            System.out.println("Your test case passed.");
        }else{
            System.out.println("Failed Test Case Scenario.");
        }




    }

    public static void openBrowser(String browser){  // chrome, firefox, edge, safari ......
        System.out.println("Launching " + browser+ " browser");
    }

    public static void navigateToUrl(String url){
        System.out.println("Navigate to " + url);
    }

    public static void searchForItem(String item){
        System.out.println("Pass: verify " +item+ " exists");
        System.out.println("Click on that " +item);
    }

    public static String verifyItemIsDisplay (){
        String result = "Pass";
        return result;
    }
}
