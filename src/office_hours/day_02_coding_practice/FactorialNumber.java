package office_hours.day_02_coding_practice;

public class FactorialNumber {
    // Factorial of a number -> sum of numbers (5 -> 120 5*1 =5, 5*4 =20, 20*3=60, 60*2=120)

    public static int factorialNumber(int num){

        int factorial = 1;

        while (num >=1){
            factorial *= num;
            num--;
        }
        return factorial;

    }

    public static int factorialNumber2(int num){

        int factorial = 1;

        for (int i = num; i>=1; i--){
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
        System.out.println(factorialNumber2(5));
    }
}
