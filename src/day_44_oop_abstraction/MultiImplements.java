package day_44_oop_abstraction;

public interface MultiImplements {
    void method1();

}
interface A {
    void method2();
}

class TestMultiImplements implements  MultiImplements, A{


    @Override
   public void method1(){
       System.out.println("Hello");
   }
   @Override
   public void method2(){
       System.out.println("Hello 2");
   }

    public static void main(String[] args) {

    }
}