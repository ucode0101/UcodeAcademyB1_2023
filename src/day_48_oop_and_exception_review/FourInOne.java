package day_48_oop_and_exception_review;

public abstract class FourInOne {

    // Encapsulation
    private int age;

    // setter
    public void setAge(int age){
        this.age = age;
    }
    // getter
    public int getAge(){
        return age;
    }

    // Abstraction
    public abstract void run();

    // regular/concrete method
    public void dance(){
        System.out.println("Dancing");
    }


}
                // Inheritance
class MainClass extends FourInOne{

    public void run(){
        System.out.println("Main class is running");
    }

    public static void main(String[] args) {
        // Polymorphism
        FourInOne object = new MainClass();


        object.run();
        System.out.println(object.getAge());

        object.dance();
    }
}

