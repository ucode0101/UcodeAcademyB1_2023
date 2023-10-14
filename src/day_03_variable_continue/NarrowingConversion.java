package day_03_variable_continue;

public class NarrowingConversion {
    public static void main(String[] args) {
        int  i = 20;
        byte b = (byte) i;
        System.out.println(b);

        double num1 = 100.999999;

        int num2 =(int) num1;
        System.out.println(num2);

        System.out.println("=================");
        byte b2 = (byte) num1;
        System.out.println(b2);




    }
}
