package day_46_oop_polymorphism_intro;

public interface Downloadable {

     boolean downloadable = true;

     void download();
}
interface iPhoneApps extends Downloadable{

    String storeName = "Apple";

}

interface AndroidApps extends Downloadable{
    String storeName = "Android";
}

abstract class Phone {

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){

        return "Brand: "+brand + " Model: "+model + " Price: $"+price+" Size: "+size;
    }
}