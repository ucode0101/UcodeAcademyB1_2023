package day_23_custom_method_continue;

public class MethodWithReturnType {

    public static void main(String[] args) {

        sum(10, 20);

       int sum = sum2( 10, 20);
        System.out.println(sum);
        System.out.println(sum2(30, 29));
    }


    // Void method does return any value, so we can store and reuse
    public static void sum(int num, int num2){
        System.out.println(num + num2);

    }

    // This method with return type (int) return int value
    // we can store it in an int variable
    public static int sum2(int num1, int num2){
        int a = num1+num2;

        return num1 + num2;

    }

}
