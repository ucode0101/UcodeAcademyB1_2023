package day_42_exceptions;

public class Browsers {

    protected void openBrowser(){
        System.out.println("Opening default browser");
    }
    public String toString(){ // We are overriding toString from Object class
        return "";
    }



}
class ChromeBrowser extends Browsers{

    @Override
   protected void openBrowser(){
       System.out.println("Opening Chrome browser");

    }

    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();
    }

}

class Safari extends Browsers{
    protected void openBrowser(){
        System.out.println("Opening Safari browser");
    }

    public static void main(String[] args) {
        Safari safari = new Safari();
        safari.openBrowser();
    }
}

class DefaultBrowser extends Browsers{
    public static void main(String[] args) {
        DefaultBrowser defaultBrowser = new DefaultBrowser();
        defaultBrowser.openBrowser();
    }
}