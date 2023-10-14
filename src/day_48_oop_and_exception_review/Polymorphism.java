package day_48_oop_and_exception_review;

public interface Polymorphism {
    void play();
}

class Person implements Polymorphism{
    @Override
    public void play() {
        System.out.println("Person is playing");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.play();
    }
}

class Dog implements Polymorphism{
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.play();
    }
}

class TestClass{
    public static void main(String[] args) {
        System.out.print(3);
        System.out.println("a");
        System.out.println("sentance ");
        System.out.println(true);
    }
}