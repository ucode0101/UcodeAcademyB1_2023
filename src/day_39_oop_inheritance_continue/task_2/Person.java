package day_39_oop_inheritance_continue.task_2;

public class Person {
    public String name;
    public int age;

    public Person(){
        System.out.println("I am Parent class Constructor");
    }

    public void talk(){
        System.out.println(name+" is talking");
    }
}
