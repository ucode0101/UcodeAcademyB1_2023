package day_40_method_overriding;

public class MethodOverriding {

    public void sayBye(){
        System.out.println("Bye");
    }
    public void sayHi() {
        System.out.println("Hi");
    }

    public String returnInput(String str){
        return str;
    }

}

class TestOverriding extends MethodOverriding{

    @Override
    public void sayBye(){
        System.out.println("Good Bye, and Have a nice day");
    }

    @Override
    public void sayHi(){
        System.out.println("Hello, how are you?");
    }

    @Override
    public String returnInput(String str){
        return "Hello "+str;
    }
    //@Override // it will not compile/compile error/ shows an error because it is not Overridden
    public void test1(){
        System.out.println("Hello");
    }



    public static void main(String[] args) {
        TestOverriding obj1 = new TestOverriding();
        obj1.sayBye();
        obj1.sayHi();
        System.out.println(obj1.returnInput("Java"));
    }

}
