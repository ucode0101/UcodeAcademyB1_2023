package day_17_while_do_while_loops;

public class WhileDoWhileLoop6 {

    public static void main(String[] args) {

        // Write a program to print a to z using while/do while loop

//        for (char ch ='a'; ch <='z'; ch++){
//            System.out.println(ch);
//        }
//
        System.out.println("Print a to z with while loop");
        char c ='a';

        while (c <='z'){
            System.out.print(c+" ");
            c++;
        }

        System.out.println();
        System.out.println("Print a to z with do while loop");

        char c2 ='a';

        do {
            System.out.print(c2+" ");
            c2++;
        } while (c2 <='z');

        System.out.println();

        System.out.println("Printing z to a using while loop");

        char z ='z';

        while (z >='a'){
            System.out.print(z+" ");
            z--;
        }

        System.out.println();
        System.out.println("Printing z to a using do while loop");

        char z2 = 'z';

        do {
            System.out.print(z2+" ");
            z2--;
        } while (z2 >='a');
    }

}
