package day_46_oop_polymorphism_intro;




class TestInterface1 implements Interface1{

    public static void main(String[] args) {
        // Interface1 ojb1 = new Interface1(); // Cannot create object of/from interface

        // Reference Type     child class
         Interface1 obj2 = new TestInterface1();





    }
}
public interface Interface1 {

}
class A {

    public static void main(String[] args) {
        A a = new A();
        // It will print false
        System.out.println(a instanceof Interface1);
    }

}


class B implements Interface1{

    public static void main(String[] args) {
        B bObject = new B();

        System.out.println(bObject instanceof  Interface1);
    }

}
