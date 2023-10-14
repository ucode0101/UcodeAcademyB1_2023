package day_45_oop_abstraction_continue;

public abstract class AbstractClass {

    abstract void sound();
    public void method1(){
        System.out.println("Hello");
    }


}

class Dog extends AbstractClass{
    public void sound(){
        System.out.println("Woof woof");
    }
}

class Cat extends  AbstractClass{
    public void sound(){
        System.out.println("Mew mew");
    }
}
