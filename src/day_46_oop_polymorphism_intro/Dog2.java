package day_46_oop_polymorphism_intro;

public class Dog2 extends Animal2{

    String dogName;

    public Dog2(int age, String dogName, String name){
        this.age = age;
        this.dogName = dogName;
        this.name = name;


    }

    public void eat(){
        System.out.println(dogName+" is eating");
    }
    public void sleep(){
        System.out.println(dogName+" is sleeping");
    }

    public static void methodA(){
        System.out.println("Dog Class");
    }

}
