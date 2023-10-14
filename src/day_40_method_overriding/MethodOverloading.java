package day_40_method_overriding;

public class MethodOverloading {

    public void sum(int a, int b){
        System.out.println(a + b);
    }
    public int sum(int a, int b, int c){
        return a + b + c;
    }
     public int sum(int a, int b, int c, int d){

        return a+b+c+d;
    }
    public static void divide(int a, int b){
        System.out.println(a / b);
    }
    public static int divide(int a, int b, int c){
        return a / b / c;
    }



}

class  Test{
    public static void main(String[] args) {
       MethodOverloading obj1 = new MethodOverloading();
       //obj1.divide(10, 2); // We can call static method through the object, but preferred to be called through the class
        MethodOverloading.divide(10, 2);


    }
}