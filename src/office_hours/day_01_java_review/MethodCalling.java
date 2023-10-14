package office_hours.day_01_java_review;

public class MethodCalling {

    public static void main(String[] args) {
        //System.out.println(0/7);

        System.out.println(math(4,0,'/'));
        System.out.println("===============================");

        System.out.println(math2(56, 0, '/'));
    }




    // Write a method to take to numbers and char as (+,-,*,/) parameter

    public static int math(int num1, int num2, char operator){

        switch (operator){

            case '*':
                return multiply(num1, num2);


            case '/':
                return division(num1, num2);

            case '+':
                return sum(num1,num2);

            case '-':
               return subtraction(num1, num2);

            default:
                System.out.println("Invalid Operator");
                return -1;

        }

    }

    public static int math2(int num1, int num2, char operator){

        if (operator == '*'){
            return multiply(num1, num2);
        }
        else if (operator == '/'){
            return division(num1, num2);
        }
        else if (operator == '+'){
            return sum(num1, num2);
        }
        else if (operator == '-'){
            return subtraction(num1, num2);
        }
        else {
            System.out.println("Invalid Operator");
            return -1;
        }

    }





    public static int sum(int a, int b){
        return  a + b;
    }
    public static int multiply(int a, int b){
        return  a * b;
    }

    public static int division(int a, int b){
        if (b ==0){
            System.out.println(a+" cannot by divided by "+b);
            return -1;
        }
        return a / b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

}
