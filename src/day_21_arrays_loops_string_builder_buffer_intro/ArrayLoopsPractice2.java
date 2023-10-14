package day_21_arrays_loops_string_builder_buffer_intro;

import java.text.DecimalFormat;

public class ArrayLoopsPractice2 {
    public static void main(String[] args) {

        // DecimalFormat


        double d = 11.0 / 3;
        System.out.println(d);

        DecimalFormat df = new DecimalFormat("0.00");


        //System.out.println(df.format(d));
        System.out.println(d);
        System.out.println("=======================");
        System.out.println(df.format(3.3333333333333));
    }
}
