package day_24_custom_method_recap;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {

        char [] c ={'a','b','c','e'};

        String str1 = Arrays.toString(c);

        System.out.println(str1);

        str1 = String.valueOf(c);

        int i=12;
        String str2 = new String(c);

        System.out.println(str2);

        int num =123;
        String str3 = String.valueOf(num);
        System.out.println(str3);


    }




}
