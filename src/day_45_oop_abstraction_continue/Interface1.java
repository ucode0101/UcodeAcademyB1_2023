package day_45_oop_abstraction_continue;

public interface Interface1 {
    //public Interface1(){} // Constructor Not allowed in interface
   // public void method1(){} // instance methods Not allowed in interface
    void method2(); // abstract method

    static void method3(){
        System.out.println("Static method");
    }
     default void method4(){
        System.out.println("Default method");
    }
     int A =100; // public static final by default

     static void main(String[] args) {
         System.out.println("Hello ");
         System.out.println(Interface1.A);
         Interface1.method3();
     }

}
