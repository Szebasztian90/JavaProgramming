package week14.browserPagesInheritance;

public class Browser {
    private static String browserType; //chrome, safari, edge, firefox...

    private static String operatingSystem; // Windows, androids, IOs, ...

    public Browser(String name){
        browserType = name;
    }


    static{
        operatingSystem = "Windows";
    }

    String getName(){
        return browserType;
    }

    public void closeBrowser(){browserType = null;} // this method is created soo we can use before setting a new one

    public void setName(String name){ // our setter method checks if there is already an open browser type before setting a new one
        if(browserType == null)
            this.browserType=name;
        else
            System.out.println("There is already an open browser:" + browserType);
        //only sets a new one if there is no browser assigned
    }

    public static String getOSName(){return operatingSystem;}

    // we mae read only field, which is OS


    @Override
    public String toString() {
        return "Browser{" +
                "browserType='" + browserType + '\'' +
                '}';
    }
}
