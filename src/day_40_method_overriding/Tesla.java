package day_40_method_overriding;

public class Tesla extends Car{

   public void showTheColor(){
       System.out.println("Red");

    }

    public void start(){
        System.out.println("Press the break and push start button");
    }

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.showTheColor();
        tesla.start();
    }
}
