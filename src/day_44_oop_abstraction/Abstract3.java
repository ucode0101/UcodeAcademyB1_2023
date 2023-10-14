package day_44_oop_abstraction;

public abstract class Abstract3 {
    public abstract void someAction();
}

abstract class Abstract4 extends Abstract3{
    public abstract void doSomeAction();
}

class TestAbstract2 extends Abstract4 {
    public void doSomeAction(){
        System.out.println("Doing some action");
    }
    public void someAction(){
        System.out.println("Some action");
    }
}
