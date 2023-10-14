package day_47_oop_polymorphism_continue;

public interface Interface {

    void someAction();
}

class TestInterface implements Interface{
    public void someAction(){
        System.out.println("Doing some action");
    }
}