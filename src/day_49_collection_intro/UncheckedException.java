package day_49_collection_intro;

public class UncheckedException {

    public static void main(String[] args) {

        String str = "Java";
        int num = 10;
        //System.out.println(num/0);

        //System.out.println(str.charAt(10));
        //System.out.println(str.substring(10));

        try {
            System.out.println(str.charAt(10));
        } catch (Exception e){

            throw new ArithmeticException("The number you gave is out of range");

        }

        try {
            System.out.println(str.substring(10));
        } catch (Exception ab){

        }

        int [] arr = {1,2};

        System.out.println(arr[5]);


    }

}
