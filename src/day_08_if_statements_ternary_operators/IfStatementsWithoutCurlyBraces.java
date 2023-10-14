package day_08_if_statements_ternary_operators;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {

        int num =11;

        // Using single if statement without curly braces {}
        if (num > 7)
            System.out.println("It is greater than 7");

        // Using if else statement without curly braces {}
        if (num % 2 ==0)
            System.out.println("It is even number");
        else
            System.out.println("It is odd number");

        // Using if else if statement without curly braces {}
        if (num > 5 )
            System.out.println("It is greater than 5");
        else  if (num % 2 ==0)
            System.out.println("It is even number");
        else if (num == 10)
            System.out.println("You hit jackpot");

        // Nested if statements without curly braces {}
        if (num >=5)
            if (num % 2==0)
                System.out.println("It is greater than 5 and it is even");
            else
                System.out.println("It is not even");
            else
            System.out.println("It is less than 5");

    }
}
