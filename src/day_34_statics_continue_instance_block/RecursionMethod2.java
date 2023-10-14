package day_34_statics_continue_instance_block;
import java.util.*;

public class RecursionMethod2 {
    public static void main(String[] args) {
        // Write a program to print from 1 to given number
        //printOneToX(10);
        System.out.println("====================");
        //printOneTo(10);
        printOneToTen(1);



    }

    public static void printOneToX(int n){
        for (int i=1; i<=n; i++){
            System.out.print(i);
        }
    }

    public static void printOneTo(int n){
        if (n >0){
            printOneTo(n - 1);
            System.out.print(n);
        }
        else {
            System.out.println(n);
        }
    }

    // print one to ten without any loop
    // This was asked in real interview
    public static void printOneToTen(int n){
        if (n <=10){
            System.out.println(n);
            printOneToTen(n+1);
        }
    }
}
