package day_35_constructors_intro;

public class ConstructorCalls2 {
    public void method1(){

        System.out.println("Hello I'm method 1");
    }
    public void method1(int num){
        System.out.println("Hello I'm method 2");
        //System.out.println(num);
    }
    public ConstructorCalls2(){
        this("Hello constructor");
        method1();
        method1(5);
    }
    public ConstructorCalls2(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2();
        System.out.println("============================");
        //new ConstructorCalls2(); // -> This calls default constructor
        //ConstructorCalls2 obj2 = new ConstructorCalls2("Java"); // This calls Constructor with String parameter
        //new ConstructorCalls2("Java");// This calls Constructor with String parameter

    }
}
