package day_41_recap;

public class Person {
    protected String name;
    protected int age;

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jame", 46);
       // person1.name = "Jame";
       // person1.age = 46;
    }
}

