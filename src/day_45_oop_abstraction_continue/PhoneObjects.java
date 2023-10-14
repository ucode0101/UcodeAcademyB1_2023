package day_45_oop_abstraction_continue;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("13 Pro",999.99,"6.1");
        iphone.calling(1214444444);
        iphone.texting(111221222);
        iphone.faceTiming(212121);
        System.out.println(iphone);


        System.out.println("=============================");


        Samsung samsung = new Samsung("S22 Pro",1199.99,"6.7");
        samsung.calling(2111111111);
        samsung.texting(201111110);
        samsung.takingPicture();
        System.out.println(samsung);




    }
}
