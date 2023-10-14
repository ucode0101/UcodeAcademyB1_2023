package day_24_custom_method_recap;

public class MethodOverloadingPractice1 {

    public static void main(String[] args) {
        int [] ar = {1,3,4,5};
        String [] s = {"java","api","test"};

        getFirst();
        getFirst("Java");

        getFirst(ar);

        getFirst(s);
    }

    // Write/create an overload method that return first char/element/str of given argument
    public static void getFirst(String str){
        System.out.println(str.charAt(0));
    }

    public static void getFirst(String [] arr){

        System.out.println(arr[0]);
    }

    public static void getFirst(int [] nums){
        System.out.println(nums[0]);
    }
    public static void getFirst(){
        System.out.println("What do you wanna get?");
    }


}
