package day_46_oop_polymorphism_intro.package_1;

public class Lion extends Animal implements WildAnimal {

    // A Lion IS-A Animal
    // A Lion IS-A WildAnimal
    // A Lion IS-A Lion
    // A Lion IS-A Object

    public static void main(String[] args) {

        Animal a1 = new Lion();
        WildAnimal a2 = new Lion();
        Lion a3 =  new Lion();
        Object a4 = new Lion();

        boolean b1 = a1 instanceof Animal;
        boolean b2 = a2 instanceof WildAnimal;
        boolean b3 = a3 instanceof Lion;
        boolean b4 = a4 instanceof Object;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        Animal animal = new Animal();
        boolean bb1 = animal instanceof Lion;

        Lion obj = new Lion();
        Animal obj2 = obj;
        Object obj3 = obj;
        WildAnimal obj4 = obj;
        // All reference variable refer to same Lion object in the heap






    }

}


