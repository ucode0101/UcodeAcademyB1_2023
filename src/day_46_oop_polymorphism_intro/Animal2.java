package day_46_oop_polymorphism_intro;

public abstract class Animal2 {

    public int age;
    public String name;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public static void methodA(){
        System.out.println("Animal class");
    }

}
