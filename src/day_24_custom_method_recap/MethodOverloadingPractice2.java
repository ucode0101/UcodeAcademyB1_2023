package day_24_custom_method_recap;

public class MethodOverloadingPractice2 {

    public static void main(String[] args) {

        System.out.println(returnAtGivenIndex(new int[]{1,2,3,4},2));
        System.out.println(returnAtGivenIndex("Java",1));
        System.out.println(returnAtGivenIndex(new String[]{"api","selenium","java"},1));
    }
    // Write/create Overloading method that takes 1 string/int arr/String arr/ and 1 number
    // and return charAt(number)
    // make sure the number is <

    public static char returnAtGivenIndex(String str, int index ){
        if ( index < str.length()){
            return str.charAt(index);
        }
        return '\0';
    }

    public static String returnAtGivenIndex(String [] arr, int index){

        if (index <arr.length){
            return arr[0];
        }
        return null;
    }

    public static int returnAtGivenIndex(int [] arr, int index){
        if (index < arr.length){
           return arr[index];
        }
        return -1;
    }
}
