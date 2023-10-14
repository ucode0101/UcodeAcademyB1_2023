package day_06_logical_operator_if_statement;

public class LogicalOROperator {
    public static void main(String[] args) {

        int num1 = 19;
        int num2 = 45;
        int num3 = 59;

        boolean b1 = num1 > num2 || num1 < num3;

        System.out.println("==========================");

        boolean b2 = 'a' > 'w' || "Java" == "API" || 77 % 2 !=0;


        System.out.println(b1);

        System.out.println("==========================");

        System.out.println(b2);

        System.out.println("===============================");

        boolean b3 = 10 > 56 || 488 % 2 == 0;

        System.out.println(b3);

        // Task 1 create 1 int variable and check if the variable is greater than 20 OR the variable is even
        // Task 2 create 1 int variable and check if the variable is greater than 10 OR the variable is odd

        System.out.println("======================================");

        boolean b4 = 5 < 4 && 10 < 12 || 7 !=8 && 4 == 2 || 5 > 2;
        System.out.println(b4);

        System.out.println("======================================");


        boolean b5 = (5 * 5 ) > 19 && (5 % 2 ==0) || 56 % 2 ==1;
        System.out.println(b5);

        System.out.println("=========================");

        boolean b6 = false;
        System.out.println(!b6);

        String outsideWeather ="shiny";
        int degree = 70;

        boolean comp2 = (!(outsideWeather == "shiny") || degree == 70);
        System.out.println(comp2);
    }
}
