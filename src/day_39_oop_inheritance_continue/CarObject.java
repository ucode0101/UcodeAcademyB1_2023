package day_39_oop_inheritance_continue;

public class CarObject extends Car {

    int speed = 150;

    public void showSpeed(){
        System.out.println("Showing speed from parent class");
      //super.showSpeed();
        System.out.println(super.speed);
        System.out.println("showing speed from current child class");
        System.out.println(this.speed);

    }

    public static void main(String[] args) {
        CarObject car1 = new CarObject();
        car1.showSpeed();

    }

}
