package day_23_custom_method_continue;

public class CustomMethodPractice1 {

    public static void main(String[] args) {
        // Write a method to check equality of two string/number

        checkEquality1("java","selenium");
    }


    public static void checkEquality1(String str, String str2){
        boolean b = str.equals(str2);
        System.out.println(b);
    }

    public static boolean checkEquality(String str1, String str2){

        // 1st way
        //return str1.equals(str2);

        // 2nd way
//        boolean b = str1.equals(str2);
//        return b;

        // 3rd way
//        if (str1.equals(str2)){
//
//            return true;
//        } else {
//            return false;
//        }
        // 4th way
        if (str2.equals(str1)){
            return true;
        }
        return false;

    }


}
