package day_34_statics_continue_instance_block;

public class RecursiveMethod {

    public static void sayHello(){
        sayHello();
    }
    public void sayBye(){
        System.out.println("Bye");
       // sayBye();
    }

    public static void main(String[] args) {
       // RecursiveMethod obj = new RecursiveMethod();  // create object first
        //obj.sayBye(); // call instance method through the object
       // new RecursiveMethod().sayBye(); // We can also call instance method/variable this way too


        //RecursiveMethod.sayHello(); // through the class
        //sayHello(); // or directly
    }
}
