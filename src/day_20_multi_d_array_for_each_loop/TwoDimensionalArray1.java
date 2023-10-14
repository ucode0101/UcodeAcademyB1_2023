package day_20_multi_d_array_for_each_loop;

public class TwoDimensionalArray1 {
    public static void main(String[] args) {

        // Task 2:
        // Write a program to find the longest name from two-dimensional array
        // Two-dimensional array is array of arrays/ we can

       // We can say it is 3 group of people with multiple people in each group
       String [][] strArray = { {"Mike","James","Kudratullo"}, {"Allison", "Jackson", "Sara"},{"Tom", "Ric"} };

       String longName = "";


       for (int i=0; i< strArray.length; i++){

           for (int j=0; j< strArray[i].length; j++){

               if (strArray[i][j].length() > longName.length()){
                   longName = strArray[i][j];
               }

           }

       }
        System.out.println(longName);

    }
}
