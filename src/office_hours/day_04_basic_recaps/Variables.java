package office_hours.day_04_basic_recaps;

public class Variables {


    static String staticVariable = "Java";
    String instanceVariable;

    public void method1(){
        String lastName;
        System.out.println("Hello method 1");

    }
   public void method2(){
        instanceVariable = "API";
       System.out.println("Hello method 2");

   }

   public static void method3(String arr){
        System.out.println("Hello static method");
    }
}


class TestObject{



    public static void main(String[] args) {


        Variables obj = new Variables(); // this obj is accessible only within the main


    }

}