package day_41_recap;

public class ConstructorCalls {

    public ConstructorCalls(){
        this("java"); // calling string arg constructor in current/same class

        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int num){
        this();

        System.out.println(num);
    }
    public ConstructorCalls(String str){

        System.out.println(str);
    }
}

class Testing  extends ConstructorCalls{

    public Testing(){
        super("java"); // it calls parent/super class's  String arg/param constructor
    }
    public Testing(int a){
        super(); // it calls parent/super class's default constructor
    }

}