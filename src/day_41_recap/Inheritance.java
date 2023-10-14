package day_41_recap;

public class Inheritance {
    protected String name;
    public void method1(){
        System.out.println("Method 1");
    }
}

class Test1 extends Inheritance{
    public String name2;
    public static void main(String[] args) {
        Test1 object = new Test1();
        object.name = "Mike";
        System.out.println(object.name);

    }
}

class Test2 extends Test1{
    public static void main(String[] args) {
        Test2 obj = new Test2();

    }
}