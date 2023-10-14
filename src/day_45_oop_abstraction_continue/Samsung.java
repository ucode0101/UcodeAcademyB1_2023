package day_45_oop_abstraction_continue;

public class Samsung extends Phone{
    public void calling(long phoneNumber){
        System.out.println("Samsung user is Calling "+ phoneNumber);
    }
    public void texting(long phoneNumber){
        System.out.println("Samsung user is Texting ");
    }

    public void takingPicture(){
        System.out.println("Taking a picture with Samsung");
    }

    public Samsung(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }
    static {
        brand = "Samsung";
    }


}
