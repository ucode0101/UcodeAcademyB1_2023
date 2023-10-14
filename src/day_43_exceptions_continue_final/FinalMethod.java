package day_43_exceptions_continue_final;

public class FinalMethod {

    final public void sayHello(){
        System.out.println("Hello");
    }

    public void sayBye(){
        System.out.println("Bye");
    }
}

class TestFinalMethod extends FinalMethod{
    // public void sayHello(){} // cannot override final method

    public void sayBye(){
        System.out.println("Hello and bye");
    }
    public static void main(String[] args) {
        TestFinalMethod obj = new TestFinalMethod();
        obj.sayBye();
    }
}
