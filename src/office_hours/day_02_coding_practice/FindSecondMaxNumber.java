package office_hours.day_02_coding_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FindSecondMaxNumber {
    // Find Second Max num  from Array/ArrayList
    // 1,2,2,4,3,2,3,44,6,7,19,33,2


    public static void main(String[] args) {
        int [] d = {4,4,-1,2,61,101,89,7,-99, 98,-11,11, 0, -0,33,21,23,67};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,-1,2,61,101,89,7,-99, 98,-11,11, 0, -0,33,21,23,67));
        System.out.println(findSecondMax(d));
        System.out.println(findSecondMax2(list));
        System.out.println(findSecondMax3(d));
    }
    public static int findSecondMax(int [] arr){

        int max1 = Integer.MIN_VALUE; // 1
        int max2 = Integer.MIN_VALUE; //

        for (int i=0; i< arr.length; i++){
            // 1,2,2,4,3,2,3
            if (arr[i] >max1){
                max2 = max1; // will have value of max1 which is 2
                max1 = arr[i]; // 4

            } else if (arr[i] > max2 && arr[i] <= max1){
                max2 = arr[i]; // 3
            }

        }
        return max2;

    }

    public static int findSecondMax2(ArrayList<Integer> num){

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i=0; i<num.size(); i++){

            if (num.get(i) > max1){

                max2 = max1;
                max1 = num.get(i);
            }
            else if( num.get(i) > max2 && num.get(i) != max1){
                max2 = num.get(i);
            }

        }
        return max2;

    }

    public static int findSecondMax3(int [] arr){

        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("."));

    }

}
