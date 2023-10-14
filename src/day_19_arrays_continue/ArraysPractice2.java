package day_19_arrays_continue;

public class ArraysPractice2 {
    public static void main(String[] args) {
        // write a program to print all number greater than 6 from int array

        int [] nums = {3,5,1,2,3,4,5,6,7,99,88,77,55,43};

        for (int i=0; i< nums.length; i++){

            if (nums[i] > 6 ){
                System.out.println(nums[i]);
            }


        }
        System.out.println("=======================================");

        // write a program to find min and max number from int array;

        int min = nums[0]; // we just need any number from int array
        int max = nums[0]; // we just need any number from int array

        for (int i=0; i< nums.length; i++){

            if (min > nums[i]){ // or this way nums[i] < min
                min = nums[i];
            }
            if ( max < nums[i]){ // or this way nums[i] > max
                max = nums[i];
            }

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);



    }
}
