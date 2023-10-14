package day_22_string_builder_buffer_custom_method;

public class StringBuilderBufferPractice {

    public static void main(String[] args) {
        // Task 1:
        // Write a program to delete all 'a' from a string. Use StringBuilder or StringBuffer

        StringBuilder str = new StringBuilder("java");

        for (int i=0; i< str.length(); i++){

            if (str.charAt(i) == 'a'){

                str.delete(i, i+1);
            }
        }
        System.out.println(str);

        System.out.println("=============================");

        // Task 2:
        // Write a program to replace all 'a' with 'b'

        StringBuffer str2 = new StringBuffer("java");

       for (int i=0; i< str2.length(); i++){
           if (str2.charAt(i) == 'a'){
               str2.replace(i, i+1, "b");
           }
       }
        System.out.println(str2);

        System.out.println("===========================");

       // Task 3:
        // Write a program to insert 'A' in front of each 'a' in a string -> java => jAavAav

        StringBuilder str4 = new StringBuilder("java");

        for (int i=0; i< str4.length(); i++){
            if (str4.charAt(i) == 'a'){

                str4.insert(i, "A");
                i++;



            }
        }
//        str4.insert(1,"A");


        System.out.println(str4);



    }










}
