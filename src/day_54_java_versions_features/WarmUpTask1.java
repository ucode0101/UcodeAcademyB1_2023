package day_54_java_versions_features;

import java.util.*;

public class WarmUpTask1 {

    public static void main(String[] args) {
        // Task 1:
        //Create a List<Integer> called "numbers" and store 10 different numbers in it
        //and create 2 Maps -> Map<Integer, String> even, Map<Integer, String> odd and loop through the List,
        // if number is even add it to even map as key and "even" as value
        //if number is odd add to odd map as key and "odd" as value

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,23,44,26,77,89,24,22,89,100));

        Map<Integer, String> even = new LinkedHashMap<>();
        Map<Integer, String> odd = new LinkedHashMap<>();

        for (Integer num : numbers){
            if (num % 2 ==0){

                even.put(num, "Even");
            }
            else {

                odd.put(num, "Odd");
            }
        }
        System.out.println(even);
        System.out.println(odd);


    }
}
