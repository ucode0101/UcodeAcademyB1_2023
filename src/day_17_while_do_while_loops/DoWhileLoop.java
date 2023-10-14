package day_17_while_do_while_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Task 1:
        // print 1 to 10

        int i =1;

        do{
            System.out.println(i); // This code gets executed at least once, and the condition is checked
                                  // if the condition is true it keep executing the statement
            i++; // update/increment
        }while (i>100); // boolean expression/condition

        System.out.println("======================================");

        int j =1;

        while (j >100){
            System.out.println(j);
            j++;
        }

    }
}
