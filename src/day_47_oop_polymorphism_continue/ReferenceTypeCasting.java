package day_47_oop_polymorphism_continue;

public class ReferenceTypeCasting {

    public static void main(String[] args) {



        double d = 45.99;

        int a = (int) d;

        System.out.println(a);

        int ab = 33;
        double dd =  ab;


        B bObject = new B();

        A AObject =  bObject; // Upcasting done automatically/implicitly

        A objectA = new A();

        B objectB = (B) objectA; // Down-casting done manually/explicitly


        int num = 1234;
        String str = ""+num;



    }
}

class A {

}
class B extends A{

}
