package day_19_arrays_continue;

public class ArrayPractice6 {

    public static void main(String[] args) {
        // Write a program to find the longest string from string array


        String [] strArray = {"java","automation","api","testingjavaapi","selenium"};

        String longStr = strArray[0];
        String shorStr = strArray[0];

        // Find longest string
        for (int i =0; i< strArray.length; i++){

            if (strArray[i].length() > longStr.length()){

                longStr = strArray[i];
            }

            if (strArray[i].length() < shorStr.length()){
                shorStr = strArray[i];
            }


        }
        System.out.println("Longest str: "+longStr);
        System.out.println("Shortest str: "+shorStr);

    }
}
