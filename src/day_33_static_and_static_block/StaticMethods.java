package day_33_static_and_static_block;

public class StaticMethods {
    int instanceVariable;
    static int staticVariable;

    public static void main(String[] args) {

        StaticMethods obj1 = new StaticMethods();
        obj1.instanceVariable = 100;

        System.out.println(obj1.instanceVariable);

        StaticMethods obj2 = new StaticMethods();

        obj2.instanceVariable = 300;
        System.out.println(obj2.instanceVariable);

        System.out.println("=====================================");

        StaticMethods obj3 = new StaticMethods();

        //obj3.staticVariable = 200; // We can access static variable through the object/instance, but it commonly accessed through the class

        StaticMethods.staticVariable = 200; // To access static variable throught the class


       // System.out.println(obj3.staticVariable);// accessing static variable through the object/instance

        //System.out.println(obj1.staticVariable);// accessing static variable through the object/instance

        System.out.println(StaticMethods.staticVariable);

        obj1.staticVariable = 190;

        System.out.println(obj1.staticVariable);

        obj2.staticVariable = 180;

        System.out.println(obj2.staticVariable);

        System.out.println("==========================");

        System.out.println(obj1.staticVariable); // What is it going to print
    }
}
