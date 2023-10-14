package day_40_method_overriding;

public class Audi extends Car{

    public void showTheColor(){
        System.out.println("Black");
    }

    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.showTheColor();
    }
}
