package day_18_nested_loop_arrays_intro;

public class ArraysIntro {
    public static void main(String[] args) {


        int score1=10;
        int score2 = 15;
        // Declare Arr

        // Declare
        int [] numbers;
        //instantiate
        numbers = new int[5];

        // second way
        int [] numbers2 = new int[15];


        // Assign values
        numbers[0] = 10;
        numbers[2] = 20;
        numbers[3] = 45;
        numbers[4] = 55;

        System.out.println(numbers[0]);

        int num = numbers[2];
        System.out.println(num);
        System.out.println(numbers[1]);

        byte [] byteArray = new byte[5];
        short [] shorArray = new short[5];
        char [] charArray = new char[5];
        float [] floatArray = new float[5];
        long longArray [] = new long[5];
        double [] doubleArray = new double[5];
        boolean [] booleanArray = new boolean[5];
        String [] strArray = new String[5];


        System.out.println("==============================");
        System.out.println(byteArray[1]);
        System.out.println(shorArray[1]);
        System.out.println(numbers[1]);
        System.out.println(floatArray[1]);
        System.out.println(longArray[1]);
        System.out.println(doubleArray[1]);
        System.out.println(booleanArray[1]);
        System.out.println(charArray[1]);
        System.out.println(strArray[1]);



    }
}
