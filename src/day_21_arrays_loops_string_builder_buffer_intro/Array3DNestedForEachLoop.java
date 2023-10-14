package day_21_arrays_loops_string_builder_buffer_intro;

public class Array3DNestedForEachLoop {

    public static void main(String[] args) {

        // one-dimensional array
        int [] d1 = {1,2,3,4,5};

        // For each iterates over each element/value in array (only one-dimensional array)
        for (int i : d1){

            System.out.print(i);
        }
        System.out.println();

        System.out.println("===================================");

        // two-dimensional array
        int [][] d2 = { {1,2,3,4,5}, {6,7,8,9} };

        for (int [] i : d2){

            for (int j : i){

                System.out.print(j+" ");

            }
            System.out.println();
        }


        // Print three-dimensional array using nested for each loop
        int [][][] d3 = {  { {1,2,3,4}, {5,6,7,8} }, {  {9,10,11,12}, {12,13, 14, 15} }  };

        for (int [][] a : d3){

            for (int [] b : a){

                for (int i : b){
                    System.out.print(i+" ");
                }

                System.out.println();
            }

        }



    }
}
