package day_39_oop_inheritance_continue;

public class Person {
    String name;
    int age;

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
    }

}

class PersonObject extends Person {

    String name;
    int age;

    public PersonObject(String name, int age){
        super.name = name;
        super.age = age;

        this.name = name;
        this.age = age;


    }

    public static void main(String[] args) {
        PersonObject object = new PersonObject("Jack", 21);
        System.out.println(object.name);
        System.out.println(object.age);

        System.out.println("==========================");
        object.showInfo();

    }

}
