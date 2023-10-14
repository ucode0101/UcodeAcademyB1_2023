package day_20_multi_d_array_for_each_loop;

public class NestedLoops {

    public static void main(String[] args) {
        // Write to print each char from string array

        String [] names = {"Mike","Smith","John","David"};

        for (String each : names){

            for (int i=0;i< each.length(); i++){
                System.out.println(each.charAt(i));
            }
            System.out.println();
        }

        // Create two-dimensional int array and store some numbers
        // and use any nested loop to print each numbers from each array

    }
}
