package day_45_oop_abstraction_continue;

public interface Interface2 {

   String name = "Java";
    void method10();
}


class Test implements Interface2{
  @Override
  public void method10(){
      System.out.println("Hello");
  }
}


interface Interface3 extends Interface2 {

}