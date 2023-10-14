package day_46_oop_polymorphism_intro;

public class iPhone extends Phone implements iPhoneApps{


    static {
        brand = "Apple iPhone";
    }

    public iPhone(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void download(){
        System.out.println("iPhone is downloading App from "+storeName);

    }

    @Override
    public void texting(long phoneNumber){
        System.out.println("iPhone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("iPhone is calling "+ phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("iPhone is face timing "+phoneNumber);
    }

    public void selfie(){
        System.out.println("Taking selfie with+ "+model);
    }
}
