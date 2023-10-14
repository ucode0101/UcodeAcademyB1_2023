package day_44_oop_abstraction;

public abstract class Abstraction1 {
    public abstract void saySomething();
    public abstract int doSomething(int x);
    public void sayHello(){
        System.out.println("Hello");
    }
}
class TestAbstract extends Abstraction1{
    public void saySomething(){
        System.out.println("Hello");
    }
    public int doSomething(int x){
        return x * x;
    }

    public static void main(String[] args) {
        TestAbstraction2 obj = new TestAbstraction2();
        System.out.println(obj.doSomething(5));
        obj.saySomething();
        //obj.sayHello(); // this is regular method, it doesn't complain even don't override
    }

}

class TestAbstraction2 extends Abstraction1{
    public int doSomething(int x){
        return x + x;
    }
    public void saySomething(){
        System.out.println("Have a nice day!");
    }
}