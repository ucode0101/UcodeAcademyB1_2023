package day_16_nested_for_loop;

public class NestedForLoop3 {
    public static void main(String[] args) {
        // Task

        for (int i=1; i<=10; i++){

            for (int j=1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=========================================");

        for (int i=1; i<=10; i++){

            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }

        System.out.println("=================================");

        for (char c ='a'; c<='z'; c++){

            for (char c2 ='a'; c2 <=c; c2++){
                System.out.print(c2);
            }
            System.out.println();
        }

    }
}
