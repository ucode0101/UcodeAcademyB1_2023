package day_19_arrays_continue;

public class ArrayWithForLoop {

    public static void main(String[] args) {
        int [] nums = {3,1,2,3,4,5,6,7,8,9};



        //System.out.println(Arrays.toString(nums));

        for (int i=0; i< nums.length; i++){
            System.out.println(nums[i]);

        }
        System.out.println("===================================");

        String [] str = {"java","selenium","api","maven","junit"};

        for (int i=0; i< str.length; i++){
            System.out.println(str[i]);
        }

        System.out.println("=======================================");

        char [] chars = {'a','d','e','w'};
        for (int i=0; i< chars.length; i++){
            System.out.println(chars[i]);
        }

    }
}
