package day_17_while_do_while_loops;

public class WhileLoop {
    public static void main(String[] args) {
        // Print 1 to 10;

        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("Printing with while loop");

        int i =1; // initialization

        while (i <=10){ // keep repeating the code inside the loop body while the condtion
            System.out.println(i);

            i++; // update/increment/decrement
        }
        System.out.println("=======================================");

        // Task print 10 to 1

        for (int n=10; n>=1; n-- ){
            System.out.println(n);
        }
        System.out.println("Print 10 to 1 with while loop");

        int n = 10;
        while ( n >=1){
            System.out.println(n);
            n--;
        }

        System.out.println("Printing all number until evenly divisible by 3 and 5");
        int j =16;
        // Task:
        // Print all number until the number is evenly divisible by 3 and 5

        while (true){

            if (j % 3 ==0 && j % 5 == 0){
                break;
            } else {
                System.out.println(j);
            }
            j++;

        }







    }
}
