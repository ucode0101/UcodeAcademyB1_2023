package day_24_custom_method_recap;

public class CustomMethodsPractice1 {

    public static void main(String[] args) {

        System.out.println(getDriver("chrome"));

        System.out.println("=========================");
        System.out.println(returnCharAt("java",4));

        System.out.println("================================");
        System.out.println(returnCharAt2("Java",12));


    }

    // write/create a return method that takes driver name as a string
    // and return the browser for given driver

    public static String getDriver(String driver){

      switch (driver.toLowerCase()){

          case "chrome":
              return "Chrome browser";

          case "firefox":
              return "Firefox browser";

          case "safari":
              return "Safari browser";

          case "edge":
              return "MS Edge browser";

          default:
              return "Invalid driver";
      }

    }

    // Write/create a method that takes 1 string and 1 number
    // and return charAt(number)
    // make sure the number is <= str.length()

    public static String  returnCharAt(String str, int index){
        if (index < str.length()){
            return str.charAt(index)+"";
        }
        System.out.println("Index is greater than str length");
        return null; // null or ""

    }

    public static char  returnCharAt2(String str, int index){
        if (index < str.length()){
            return str.charAt(index);
        }
        System.out.println("Index is greater than str length");
        return '\0'; // null

    }




}
