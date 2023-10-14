package day_13_string_class_continue;

public class StringSubstringMethod {
    public static void main(String[] args) {

        String str = "hello I am doing some java";

        //String str2 = ""+str.charAt(0)+str.charAt(1)+str.charAt(2);
        String str2 = str.substring(0, 3); // take from index 0 until index not including index 3

        System.out.println(str2);
        System.out.println("=================================");

        String str3 = str.substring(3);
        System.out.println(str3);

        System.out.println(str.substring(str.length()-1));
        System.out.println("=======================================================");

        char ch =str.charAt(0);




    }
}
