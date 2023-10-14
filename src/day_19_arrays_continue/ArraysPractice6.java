package day_19_arrays_continue;

public class ArraysPractice6 {
    public static void main(String[] args) {

        // Write a program to find average number from int array

        int [] nums = {4,533,4,55,6,7,1,2,34,67,89,90,86};

        int average = 0;
        int sum =0;

        for (int i=0; i< nums.length; i++){

            sum += nums[i];
        }
        average += sum / nums.length;

        System.out.println(average);
        System.out.println("=================================");

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Max int: "+maxInt);
        System.out.println("Min int: "+minInt);

    }
}
