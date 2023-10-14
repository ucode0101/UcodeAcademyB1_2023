package day_05_unary_shorthand_operators;

public class Variables {
    public static void main(String[] args) {

        int num = 60 / 2; // ?
        System.out.println(num);

        System.out.println("=============================");

        int num2 = 5 * 5;
        System.out.println(num2);

        System.out.println("==============================");

        int num3 = 10 -3;
        System.out.println(num3);

        System.out.println("==============================");

        int num4 = 15 / 5;
        System.out.println(num4);

        System.out.println("==============================");

        int num5 = 15 % 10;
        System.out.println(num5);

        System.out.println("==============================");
        int n1 = 20;
        int n2 = 30;


        boolean b1 = n1 ==n2;
        System.out.println(b1);

        System.out.println("=============================");

        int n3 = 5 % 2 * 2;
        System.out.println(n3);
        System.out.println("==============================");

        // Task:
        // Find if a number is even or not

        int n4 = 19;
        System.out.println(n4 % 2 == 0);

        // Task:
        // Find if a number is odd or not

        int n5 = 23;

        int n6 = n5 % 2;

        boolean b2 = n6 ==0;
        System.out.println(b2);

        System.out.println("=========================");

        // Task:
        // Find if the remainder of odd number is greater than 1

        int n7 =11;
        int n8 = n7 % 10;
        boolean b3 = n8 > 1;

        System.out.println(n8);

        System.out.println("is this number greater than 1? "+b3);

        System.out.println("===============================");

        // Task:
        // Write a program that takes the remainder of odd number and multiply it by itself

        int n9 = 23;

        int n10 = n9 % 10;
//        int n11 = n10 * n10;

        System.out.println(n10 * n10);




    }
}
