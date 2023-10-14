package day_20_multi_d_array_for_each_loop;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8};

        for (int i=0; i< nums.length; i++){

            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println("===========================");

        for (int eachNum : nums){

            if (eachNum == 5){
                continue;
            }
            else {
                System.out.print(eachNum);
            }

        }

        System.out.println();
        System.out.println("==========================================");
        // Task:
        // Write a program to find the longest name from String array using for each loop

        String [] names = {"Jame","Richard","Tom","Sara","Alexandra"};
        String longName ="";

        for (String each : names){

            if (each.length() > longName.length()){
                longName = each;
            }

        }
        System.out.println(longName);

    }
}







