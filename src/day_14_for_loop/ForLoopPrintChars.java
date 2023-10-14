package day_14_for_loop;

public class ForLoopPrintChars {
    public static void main(String[] args) {
        // Write a program that print from a to z (lower case)

        char c = 'a';


        System.out.println(c);
        System.out.println("===========Printing a to z=============");

        for (char ch = 'a'; ch <= 'z'; ch ++){

            System.out.print(ch+" ");

        }
        System.out.println();

        System.out.println("==========Printing A to Z===========");
        String s ="";

        for (char ch ='A'; ch <='Z'; ch++){
            s += ch+""+c+" ";
            System.out.print(ch+""+c+" ");
            //System.out.println(ch);
            c++;
        }
        System.out.println();
        System.out.println("Stored in a String");
        System.out.println(s);

    }
}
