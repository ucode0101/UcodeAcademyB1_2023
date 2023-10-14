package day_41_recap;

public class Statics {
   public static String name = "Java";
   public String name2 ="Java";
   public static int num;

   static {
       num = 100;
       method1();
       method2(10);

   }

   public static void method1(){
       System.out.println("hello");
   }
   public static int method2(int num){
      // method3(); // static method cannot call instance method directly
       return num;
   }

   public void method3(){
       System.out.println("Instance method");
       method1(); // Instance method can access/call static method directly
       name = "API"; // Instance method can access static variables directly

   }


}
class TestStatic{
    public static void main(String[] args) {



        System.out.println(Statics.name);
        System.out.println("===========================");

        Statics obj= new Statics();
        obj.name = "API";

        System.out.println(obj.name);

        Statics.method1();
        obj.method1();

       // Statics.method3(); // can not call instance method through the class
        System.out.println(Statics.num);

    }
}
