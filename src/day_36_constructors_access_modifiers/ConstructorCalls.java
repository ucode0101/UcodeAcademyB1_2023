package day_36_constructors_access_modifiers;

public class ConstructorCalls {
    String name;
    int age;
    public void method1(){
        System.out.println("instance method");
        //ConstructorCalls(); // Only constructor can call another constructor
    }
    public static void method2(){

    }

    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    public ConstructorCalls(String name, int age){
        this.name = name;
        this.age = age;
    }

    public ConstructorCalls(){
        this("Hello");
        System.out.println("Default Constructor");
        method1();
    }

    public ConstructorCalls(String name){
        this(33);
        //name = name; We need to use this because parameter variable and instance variable have the same name
        this.name = name;
        System.out.println("Constructor with String parameter");
    }

    public ConstructorCalls(int age){
        //this();
        this.age = age;
        System.out.println("Constructor with int parameter");
        method2();

    }

    public static void main(String[] args) {
        ConstructorCalls obj = new ConstructorCalls();// Default constructor get executed/invoke
        System.out.println(obj.name);


    }


}
