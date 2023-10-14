package day_41_recap;

import day_40_method_overriding.Tesla;

public class Constructors {
    public Integer num;
    public static void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Methdod 2");
    }

    public Constructors(int a){
        num = 123;
    }
    public Constructors(String str){
        method1();
        method2();

    }

    public static void main(String[] args) {
        Constructors object = new Constructors(1);
        System.out.println(object.num);
    }
}

class Test extends Constructors{
    public Test(int abc){
        super(12);
    }

}