package day_46_oop_polymorphism_intro;

public class Animal2Objects {

    public static void main(String[] args) {

        Dog2 dog2 = new Dog2(1, "Rex","Dog2");
        System.out.println(dog2.dogName);

        Animal2 dog3 = new Dog2(2,"Rocky","Do3");
        dog3.methodA();




        boolean b1 = dog3 instanceof Dog2;
        boolean b2 = dog3 instanceof Animal2;

        System.out.println("==============================");

        boolean b4 = dog2 instanceof Dog2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("==========================");

        Animal2 obj = new Dog2(3, "Object","Dog Object");

        boolean bb1 = obj instanceof  Animal2;// expecting true
        boolean bb2 = obj instanceof Dog2;// expecting tru

        boolean bb3 = obj instanceof Cat2; // expecting false

        System.out.println("is it Instance of Animal2? "+bb1);
        System.out.println("is it Instance of Animal2? "+bb2);
        System.out.println("is it Instance of Cat2? "+ bb3);

















    }
}
