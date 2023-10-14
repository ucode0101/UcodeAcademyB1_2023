package day_35_constructors_intro;

public class ConstructorCalls {

    public ConstructorCalls(){
        this(5); // it calls the constructor that has int parameter
        System.out.println("I am default Constructor"); // This executes fourt

    }

    public ConstructorCalls(String str){
        System.out.println(str); // This executes first
    }

    public ConstructorCalls(int num){
        //this();// it calls default constructor
        //ConstructorCalls() ->  Constructor cannot be call by name
        this("Hello World");
        System.out.println(num); // This executes second
        System.out.println("Hello"); //Thi executes third
    }

    public static void main(String[] args) {
        ConstructorCalls obj = new ConstructorCalls();
    }
}
