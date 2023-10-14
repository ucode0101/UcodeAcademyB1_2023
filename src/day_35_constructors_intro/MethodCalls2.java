package day_35_constructors_intro;

public class MethodCalls2 {


    public void method(){
        method(5);
        System.out.println("I am No arg method");
    }
    public void method(int num){
        method("Hello World");
        System.out.println(num);
        System.out.println("Hello");
    }

    public void method(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        MethodCalls2 obj = new MethodCalls2();
        obj.method();
    }
}
