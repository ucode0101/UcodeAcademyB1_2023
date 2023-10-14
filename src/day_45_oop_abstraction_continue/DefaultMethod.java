package day_45_oop_abstraction_continue;

public interface DefaultMethod {

    default void method1(){
        System.out.println("Hello default method");
    }
}
class TestDefaultMethod implements DefaultMethod{

    public static void main(String[] args) {
        TestDefaultMethod obj = new TestDefaultMethod();
        obj.method1();
    }
}