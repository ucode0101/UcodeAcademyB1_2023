package day_05_unary_shorthand_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        //x = x + y; // longer way/regular way

        x += y; // shorter way/shorthand operator
        System.out.println(x);

        int z = 20;
        int w = 10;

       // z = z - w; longer way/regular way

        z -= w; // shorthand/shorter way

        System.out.println(z);

        System.out.println("==============================");

        int a = 45;

        int b = 12;

        //a = a * b; // longer/regular way
        a *= b;
        System.out.println(a);

        System.out.println("=========================================");

        int i = 20;
        int j = 6;

        // i = i / j; // longer/regular way

        i /= j;
        System.out.println(i);


        int e = 35;
        int f = 12;

        // e = e % f; longer/regular way

        e %= f;
        System.out.println(e);








    }
}
