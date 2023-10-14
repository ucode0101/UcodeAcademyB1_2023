package office_hours.day_04_basic_recaps;

public class TestObject2 {
    // in Class body/level all instance methods can access this obj2 within this class
    Variables obj2 = new Variables();

    public static void main(String[] args) {

        //obj2.method1(); main method cannot access it
        Variables.method3("str");

    }

    public void accessObject(){
       // Variables obj2 = new Variables();
        obj2.method1();
        obj2.method2();
    }

    public void testMethod(){
        String name ="java";
        //Variables obj2 = new Variables();
        obj2.instanceVariable = "java";
        obj2.method1();
        obj2.method2();
    }
}
