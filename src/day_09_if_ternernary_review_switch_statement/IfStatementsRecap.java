package day_09_if_ternernary_review_switch_statement;

public class IfStatementsRecap {
    public static void main(String[] args) {
        // if statement

        String str = "java";

        if (str == "java"){
            System.out.println("I love Java");
        }


        if (str == "java") {

          str += " and selenium";

        }
        else {
            str = "API";
        }
        System.out.println(str);

        System.out.println("==========================");

        // Task 1:
        // Swap two number n1 = 5; n2 = 10; --> n1 = 10; n2 =5;
        // Hint -> use a temp var

        int n1=5;
        int n2 =10;

        int temp = n1; // 5 temp variable holding the value of n1

        n1 = n2; // 10 now we assign n2's value which 10 to n1
        n2 = temp;// 5 we assign temp which was holding the value of n1 which was 5

        System.out.println("n1 " +n1);
        System.out.println("n2 " +n2);

        System.out.println("=========================================");

        // Task: use nested if
        // Write a program to check if the number is greater 50
        // if it is even number multiply it by 5
        // if it is odd multiply by 4

        int num = 419;

        if (num > 50){

            if (num % 2 ==0){
                num *=5;
            } else {
                num *=4;
            }

        }

        System.out.println(num);

        System.out.println("=====================================");



        // Task: use Ternary Operator
        // Write a program to check if the number is greater 50
        // if it is even number multiply it by 5
        // if it is odd multiply by 4





    }
}
