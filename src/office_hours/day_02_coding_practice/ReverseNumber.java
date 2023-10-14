package office_hours.day_02_coding_practice;

public class ReverseNumber {
    public static void main(String[] args) {
        // Write a program to reverse any given number
        // 123 -> 321

        //System.out.println(reverseNumber1(4321)); // this method works only with positive number
        System.out.println(reverseNumber2(-123));



    }
    // Let's assume the number is positive
    // this is not officiant
    public static int reverseNumber1(int number){
        String str = String.valueOf(number);

        str = new StringBuilder(str).reverse().toString();

       // number = Integer.parseInt(str);

        //return number;


        return Integer.parseInt(str);


    }

    public static int reverseNumber2(int number){
        int reversed = 0;
        // 123

        while (number !=0){

            int temp = number % 10; // 3 2 1

            reversed = reversed * 10 + temp; // 321

            number /= 10;


        }
        return reversed;

    }


}
