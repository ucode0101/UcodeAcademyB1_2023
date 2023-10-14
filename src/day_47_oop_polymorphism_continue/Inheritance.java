package day_47_oop_polymorphism_continue;

public class Inheritance {

    String name;

    public void sum(int a, int b){
        System.out.println(a + b);
    }

}

class TestInheritance extends Inheritance{

    public static void main(String[] args) {
        TestInheritance obj = new TestInheritance();
        obj.sum(10,20);
    }


}