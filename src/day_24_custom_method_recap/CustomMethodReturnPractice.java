package day_24_custom_method_recap;

public class CustomMethodReturnPractice {
    public static void main(String[] args) {
        String s = login();
        System.out.println(s);

        System.out.println("=======================");
        System.out.println(login2("abc","a12"));

        System.out.println("================================");
        buySomething("abca","12345","iPhone");

    }

    // return method without parameter
    public static String login(){
        return "Entering username...\nEntering password...\nClicking on login button";
    }

    // return method with parameter
    public static boolean login2(String username, String password){
        if(username.length() <4 || password.length() < 4){
            System.out.println("Invalid user name or password");
            return false;
        }
        System.out.println("Entering username: "+username);
        System.out.println("Entering password: "+password);
        System.out.println("Clicking on login button...");

        return true;
    }
    public static void buySomething(String username, String password, String productName){

        if (login2(username,password)){
            System.out.println("Logged in... buying "+productName);
        } else {
            System.out.println("Login failed, please check your credentials");
        }


    }

}
