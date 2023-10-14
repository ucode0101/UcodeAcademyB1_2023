package office_hours.day_02_coding_practice;

public class ReverseString {
    public static void main(String[] args) {
        // Write a program to reverse any given String
        // "java" -> avaj
        // We can do it in the main method, but it's always good to create a custom method so can reuse your code
        System.out.println(reverseString1("java"));
        System.out.println(reverseString2("java"));
        System.out.println(reverseString3("java"));
        System.out.println("===============================");
        System.out.println(reverseString4("java"));

    }

    public static String reverseString1(String str){
        String reversed = "";
        // "java" -> avaj

        for (int  i =str.length()-1; i>=0; i--){

            reversed += str.charAt(i); // It creates a new object in pool. Nothing wrong with going this way

        }
        return reversed;

    }
    public static String reverseString2(String str){

        StringBuilder reversed = new StringBuilder();

        for (int i=str.length()-1; i>=0; i--){

            reversed.append(str.charAt(i)); // StringBuilder is mutable, it does not create a new object like String does

        }

        return reversed.toString();

    }

    public static String reverseString3(String str){

        //str = new StringBuilder(str).reverse().toString();

        //return str;
        return new StringBuilder(str).reverse().toString();

    }

    public static String reverseString4(String str){

        if (str.isEmpty()){
            return "";
        }

        return str.charAt(str.length()-1)+reverseString4(str.substring(0,str.length()-1));

    }


}
