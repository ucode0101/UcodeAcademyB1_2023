package day_05_unary_shorthand_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int number = +10;
        System.out.println(number);

        int number2 = -10;
        System.out.println(number2);
        System.out.println(-29);
        System.out.println(+90);

        System.out.println("===============================");

        int number3 = 20;
        ++number3;
        System.out.println(number3);

        System.out.println("===================================");

        int number4 = 49;

        --number4;
        System.out.println(number4);

        System.out.println("===================================");

        int number5 = 10;

        int number6 = ++number5;

        System.out.println(number6);

        System.out.println(number5);

        System.out.println("===========================");

        System.out.println(++number5);

        System.out.println("=======================");

        int number7 = 16;


        System.out.println(--number7);

        System.out.println(number7);

        System.out.println("====================================");

        int number8 = 12;

        int number9 = --number8;

        ++number8;

        System.out.println(--number8);








    }
}
