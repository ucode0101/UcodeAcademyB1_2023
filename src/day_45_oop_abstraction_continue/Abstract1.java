package day_45_oop_abstraction_continue;

public abstract class Abstract1 {
    public abstract void method1();

}

abstract class Abstract2 extends Abstract1{

    public abstract void method2();
}

class TestClass extends Abstract2{
    public void method1(){
        System.out.println("Hello 1");
    }
    public void method2(){
        System.out.println("Hello 2");
    }
}