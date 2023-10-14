package day_45_oop_abstraction_continue;

interface ExtendsAndImplements {
    void method1();

}

interface I1 extends ExtendsAndImplements{

}
// The above example is for extends keyword when they are same

// The bellow example is for implements keyword they are not same
interface I2 {
    default void method2(){
        System.out.println("Hello default");
    }
}

class C1 implements I2{

}

abstract class  A1 extends C1{

}
