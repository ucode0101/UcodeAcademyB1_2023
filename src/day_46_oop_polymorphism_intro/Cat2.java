package day_46_oop_polymorphism_intro;

public class Cat2 extends Animal2{
    public String catName;

    public Cat2(String catName, int age, String name ){
        this.catName = catName;
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println(catName+" is eating");
    }
    public void sleep(){
        System.out.println(catName+" is sleeping");
    }

    public void play(){
        System.out.println(catName+" is playing");
    }
}
