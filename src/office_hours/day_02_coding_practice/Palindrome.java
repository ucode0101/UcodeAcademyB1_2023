package office_hours.day_02_coding_practice;

public class Palindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("civiC"));
    }
    //Palindrome -> when a string reads same forward and backward
    // civic

    // Reverse str and use equals(), if it return it Palindrome
    // You need to compare str to reversed version of itself
    public static boolean isPalindrome(String str){

        //String str2 = new StringBuilder(str).reverse().toString();

        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
