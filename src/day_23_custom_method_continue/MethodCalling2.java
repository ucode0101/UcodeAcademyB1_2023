package day_23_custom_method_continue;

public class MethodCalling2 {

    public static void main(String[] args) {

        String word = reverseString("java");
        System.out.println(word);

        System.out.println("===============================");
       String s = reverseOrCutString("javaabc");
        System.out.println(s);

    }


    // Write a method that take string as parameter reverse it
    public static String reverseString(String str){

        String word = "";
        for (int i=str.length()-1; i>=0; i--){
            word += str.charAt(i);
        }
        return word;
    }

    // Write a program/method that takes string as parameter/arg
    // if string length is even reverse it, else remove first and last characters

    public static String reverseOrCutString(String str){


        if (str.length() % 2 ==0){
           return reverseString(str);
        }
        else {
            return str.substring(1, str.length()-1);

        }
       // return str.substring(1, str.length()-1);

    }

}
