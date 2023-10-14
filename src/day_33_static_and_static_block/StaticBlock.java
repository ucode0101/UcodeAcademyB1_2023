package day_33_static_and_static_block;

public class StaticBlock {

    public static void main(String[] args) {
        method1();
        System.out.println("Hello Main method");
        System.out.println("Hello again");
    }

    public static void method1(){
        System.out.println("Custom static method");
    }
    static {
        System.out.println("Hello, I get executed as soon as class is loaded");
        System.out.println("I get executed only once");
    }
}
