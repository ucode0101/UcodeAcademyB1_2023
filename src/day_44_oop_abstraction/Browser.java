package day_44_oop_abstraction;



public abstract class Browser {
    protected abstract void openBrowser();
}

class ChromeBrowser extends Browser{
    public void openBrowser(){
        System.out.println("Opening chrome browser");
    }
}

class SafariBrowser extends Browser {
    public void openBrowser(){
        System.out.println("Opening safari browser");
    }
}

class TestClass{
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.openBrowser();

        SafariBrowser safariBrowser = new SafariBrowser();
        safariBrowser.openBrowser();

    }
}