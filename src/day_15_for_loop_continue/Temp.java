package day_15_for_loop_continue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp {
    public static void main(String[] args) {
        String str ="abc55defg1500adfr2011";

        int totalSum = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
             totalSum+= num;
        }
        System.out.println(totalSum);


        System.out.println("===============Second way ==============");

        String temp = "";
        int re = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
            }
            else {
                if (!temp.isEmpty()) {
                    re += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        if (!temp.isEmpty()) {
            re += Integer.parseInt(temp);
        }
        System.out.println(re);
    }
}
