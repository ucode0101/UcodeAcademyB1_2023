package day_39_oop_inheritance_continue;

public class SuperKeywords {

    public SuperKeywords(){
        System.out.println("I am super/parent class constructor");
    }

    public SuperKeywords(int num){
        System.out.println("Parent/Super class constructor with int parameter");
        System.out.println(num);
    }

    public SuperKeywords(String str){
        System.out.println(str);
    }


}

class TestSuperKeyword extends SuperKeywords {

    public TestSuperKeyword(){
        //super(); // this call parent/super class's default constructor
        //super(5); // this calls parent/super class's constructor with int parameter
        super("Java"); // this calls parent/super class's constructor with String parameter
    }


    public static void main(String[] args) {
        TestSuperKeyword obj = new TestSuperKeyword();
    }

}