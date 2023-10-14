package day_21_arrays_loops_string_builder_buffer_intro;

public class ForLoopPractice {
    public static void main(String[] args) {

        // Regular/common way of for loop

        for (int i=0; i<5; i++ ){
            System.out.println(i);

        }
        int i=0;
        for (; i<5; ){
            System.out.println(i);
            i++;
        }
       int j=0;
        for (; true;){
            System.out.println("hello");

            if (j >=5){
                break;
            }
            System.out.println(j);
            j++;

        }

    }
}
