package day_03_variable_continue;

public class Practice {
    public static void main(String[] args) {
        /*
        1. Write a Java program that will print a sum of two numbers Please use variables to store num1,num2,and sum
         Sample output: 46 + 90 = 136

        2. Write a Java program to convert Fahrenheit to Celcius
        F=9*C/5+32
         */

        int num1 = 46;
        int num2 = 90;

        int sum = num1 + num2;
        System.out.println(sum);

        System.out.println("=========================");

        int c =  24;
        int f = 9* c / 5 +32; // conversion
        System.out.println(f);

        // 3. Write a Java program that converts mile to km
        // 1 mile = 1.6 km

        System.out.println("===========================");

        int miles = 50;
        double km = miles * 1.6;
        System.out.println(km);

        System.out.println("====================");

        // Write a Java program that converts km to mile

        int km2 = 80;
        double mile2 = km2 / 1.6;
        System.out.println(mile2);






    }
}
