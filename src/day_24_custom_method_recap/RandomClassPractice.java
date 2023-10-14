package day_24_custom_method_recap;

import java.util.Random;

public class RandomClassPractice {

    public static void main(String[] args) {

        Random random = new Random();

        int num = random.nextInt(); // This will generate a random int number (it does not have range)
        System.out.println(num);

        System.out.println("================================");

        double d = random.nextDouble(); // This will generate a random double number
        System.out.println(d);

        System.out.println("==============================");

        int num2 = random.nextInt(10);  // This will generate a random number from 0 to 9
        System.out.println(num2);

        System.out.println("======================================");

        int [] ar = {3,4,2,22,2,4,6,77,8,8,9,9,90};
        int index = random.nextInt(ar.length);

        System.out.println(ar[index]);

        int num3 = new Random().nextInt(19);// Without creating object/variable








    }
}
