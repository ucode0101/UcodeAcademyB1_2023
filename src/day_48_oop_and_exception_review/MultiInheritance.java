package day_48_oop_and_exception_review;

public class MultiInheritance implements interface2, interface1  {


    @Override
    public void method1() {
        System.out.println("Hello");

    }

    @Override
    public void method2() {
        interface2.super.method2();
    }

    public static void main(String[] args) {
        MultiInheritance obje = new MultiInheritance();
        obje.method1();

        interface1.method3();
        interface2.method3();
        obje.method2();
    }


}

interface interface1{
   void method1();

   default void method2(){
       System.out.println("Interface 1 Method 2");
   }
   static void method3(){
       System.out.println("Interface 1 method 3");
   }
}

interface interface2{
    void method1();

    default void method2(){
        System.out.println("Interface 2 Method 2");
    }

    static void method3(){
        System.out.println("Interface 2 method 3");
    }
}