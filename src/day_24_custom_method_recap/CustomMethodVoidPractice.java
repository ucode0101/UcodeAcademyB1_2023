package day_24_custom_method_recap;

public class CustomMethodVoidPractice {
    public static void main(String[] args) {

       login();

        System.out.println("====================");

       login2("abc","123!");



    }
    // void method without parameter
    public static void login(){
        System.out.println("Entering user name...");
        System.out.println("Entering password...");
        System.out.println("Clicking on login button....");



    }
    // void method with parameter
    public static void login2(String username, String password){

        System.out.println("Entering user name: "+username);
        System.out.println("Entering password: "+password);
        System.out.println("Clicking on Login button...");
    }

}
