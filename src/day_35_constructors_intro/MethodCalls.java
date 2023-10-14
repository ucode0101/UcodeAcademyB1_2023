package day_35_constructors_intro;

public class MethodCalls {

    public void method1(){


        System.out.println("Method 1");
        method2();
        System.out.println("Hello");
        method3();
    }

    public void method2(){
        System.out.println("Method 2");

    }
    public void method3(){
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        MethodCalls obj = new MethodCalls();
        obj.method1();
    }
}
