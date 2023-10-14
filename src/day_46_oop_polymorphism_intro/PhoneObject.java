package day_46_oop_polymorphism_intro;

public class PhoneObject {
    public static void main(String[] args) {


        iPhone iPhone11 = new iPhone("11 Pro", 999.99,"6.1");
        System.out.println(iPhone11);
        iPhone11.texting(111222111);
        iPhone11.calling(222222222);
        iPhone11.faceTime(22211111);
        iPhone11.download();
    }
}
