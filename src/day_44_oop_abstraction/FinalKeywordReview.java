package day_44_oop_abstraction;

public class FinalKeywordReview {

    public final void method1(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        final String NAME = "Java";

        //NAME = NAME.toUpperCase(); // cannot modify
        // NAME = "API"; // cannot modify/change

    }

}
class TestFinal extends FinalKeywordReview{
//    public void method1(){ // final method cannot be overridden
//
//    }

}
final class TestFinalClass{
    public void sayHi(){
        System.out.println("Hi");
    }

}

class Test1 { //  extends TestFinalClass -> does not work

}
