package day_23_custom_method_continue;

public class CustomMethodPractice3 {
    //Given an array of integers, where all elements but one occur twice, find the unique element.
    // and return it as int
    //example [3,2,1,2,1,11,12,11,3] -> 1

    public static void main(String[] args) {

        int [] arr = {3,2,1,8,2,1,11,12,11,19,3};

        int a = findUniqueElement(arr);
        System.out.println(a);
        System.out.println("========================");

        boolean b = isNumberInArray(arr, 11);

        System.out.println(b);
        System.out.println(isNumberInArray(arr, 89));
    }


    public static int findUniqueElement(int [] arr){
        int result =0;
        for (int i=0; i< arr.length; i++){
            int count =0;

            for (int j=0; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    count ++;
                }
            }

            if (count ==1){
                //return arr[i];
                result = arr[i];

               break; // we want to break once we find the unique, in case we have more than
            }
        }
        return result;

    }

    // Write a method that  that take two parameters, 1 int array, 1 number,
    // and finds number in an array

    public static boolean isNumberInArray(int [] arr, int num){

        for (int each : arr){
            if (each == num){
                return  true;
            }
        }
        return false;

    }



}
