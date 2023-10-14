package day_34_statics_continue_instance_block;

public class RecursionMethod1 {

    public static void main(String[] args) {
        // Factorial number is multiplication of positive number:
        // 5 -> 120  5 * 1 = 5; 4 * 5 = 20; 20 * 3 = 60; 60 * 2 = 120; 120 * 1 =120;

        int result = 1;
        int num =5;
        while ( num >=1){
            result *= num;
            num --;
        }
        System.out.println(result);
        System.out.println("====================================");

        System.out.println(factorial(5));
    }

    public static int factorial(int num){
        if (num <=2){
            return num;
        }
        return num * factorial(num - 1);
    }


}
