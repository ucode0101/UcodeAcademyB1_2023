package day_13_string_class_continue;

public class StringContainsMethod {
    public static void main(String[] args) {

        String str = "selenium";
        boolean b1 = str.contains("en");
        System.out.println(b1);

        // Task:
        // write a program to check if a string contains "e", and replace all e with o

        if (str.contains("e")){
            str = str.replace("e","o");
            System.out.println(str);

        } else {
            System.out.println("String does not contain e");
        }

    }
}
