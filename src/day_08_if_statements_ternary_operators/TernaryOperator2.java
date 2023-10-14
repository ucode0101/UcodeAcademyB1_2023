package day_08_if_statements_ternary_operators;

public class TernaryOperator2 {
    public static void main(String[] args) {

        // Write a program to check if a person is old enough to vote using Ternary Operator
        // Voter must be 17 or older
        int age =25;

        String str;

        if (age >= 17){
            str = "Eligible";
        }
        else {
            str = "Not Eligible";
        }
        System.out.println(str);

        System.out.println("==============================");

        String str2;
                        // if           else
        str2 = (age >=17 ) ? "Eligible" : "Not Eligible";

        System.out.println(str2);

        System.out.println("========================================");



    }
}
