package day_46_oop_polymorphism_intro;

public class PolymorphismIntro {

    public static void main(String[] args) {

        // Normal way we create
        Dog dog2 = new Dog();
        Cat cat2 = new Cat();


        // Parent class reference refers to child class's object
        // There Must be IS-A relation (inheritance)
        Animal dog = new Dog();
        Animal cat = new Cat();


        // Grand Parent class reference refers to grand-child class's object
        // There Must be IS-A relation (inheritance)
        Creature dog3 = new Dog();
        Creature cat3 = new Cat();

        // Can You do this way?
        //Yes, Every class has Object as a superclass
         Object dog4 = new Dog();

         Animal[] animals ={dog,cat,dog2, cat2};


    }


}

 class Creature{

 }

class Animal extends Creature{

}
class Dog extends Animal {

}
class Cat extends Animal {

}