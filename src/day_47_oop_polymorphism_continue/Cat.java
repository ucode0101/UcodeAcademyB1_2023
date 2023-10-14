package day_47_oop_polymorphism_continue;

public class Cat extends Animal{
    String catName;

    public Cat(String catName, String gender, int age){
        this.catName = catName;
        this.gender = gender;
        this.age = age;

    }

    public void eat(){
        System.out.println(catName+" is eating");
    }
    public void sleep(){
        System.out.println(catName +" is sleeping");
    }


    public void playing(){
        System.out.println(catName+" is playing");
    }
}
