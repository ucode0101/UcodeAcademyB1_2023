package day_19_arrays_continue;

public class ArrayWhileLoop {

    public static void main(String[] args) {

        int [] nums = {3,4,5,76,8,2,11,2,65};

        int i=0;

        while (i <nums.length){

            System.out.println(nums[i]);
            i++;
        }
        System.out.println("==================================");

        int j=0;

        do {
            System.out.println(nums[j]);
            j++;
        } while (j < nums.length);









    }
}
