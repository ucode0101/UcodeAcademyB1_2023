package day_24_custom_method_recap;

public class MethodOverloadingIntro {

    public static void main(String[] args) {
        String str ="java";

        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(2));

        System.out.println("=======================================");

        System.out.println(sum(3,3));
    }



    public static int sum(int a, int b){ // same name different parameters
        return a + b;
    }

    public static int sum(int a, int b, int c){ // same name different parameters
        return  a + b +c;
    }

    public static int sum(int a, int b, int c, int d){ // same name different parameters
        return a+b+c+d;
    }

    public static int sum(int a, int b, int c, int d, int e){ // same name different parameters

        return a + b + c+ d + e;
    }

    public static void sum(double a, double b){ // same name different parameters/data type
        System.out.println(a+b);
    }

    public static int sum(char a, char b){
        return  a+b;
    }








}
