package day_33_static_and_static_block;

public class StaticPractice2 {
    String make;
    String model;
    static boolean hasWheels = true;

    public void displayMake(){
        System.out.println(make);
    }
    public void displayMode(){
        System.out.println(make);
    }

    public static void main(String[] args) {
        StaticPractice2 car1 = new StaticPractice2();
        car1.make = "BMW";
        car1.model = "M5";

        StaticPractice2 car2 = new StaticPractice2();
        car2.make = "Audi";
        car2.model = "Q7";

        System.out.println(car1.hasWheels);
        System.out.println(car2.hasWheels);
        System.out.println(StaticPractice2.hasWheels);



    }

}
