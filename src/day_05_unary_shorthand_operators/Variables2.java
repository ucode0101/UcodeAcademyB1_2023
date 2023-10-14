package day_05_unary_shorthand_operators;

public class Variables2 {
    public static void main(String[] args) {

        int num1 = 19;

        int num2 = num1 % 2;

        System.out.println(num2 * 2);


        int n = 10;

        n = n + 5;
        System.out.println(n);

        System.out.println("============================");


        int n1 = 20;

        n1 = n1 - 5;

        System.out.println(n1);

        System.out.println("===============================");

        double dNum = 20;

        dNum = dNum + 5;
        System.out.println(dNum);

        System.out.println("===================================");

        dNum = dNum - 5;
        System.out.println(dNum);

        System.out.println("=======================");

        int num3 = 27;

        num3 = num3 * 2;

        System.out.println(num3);

        System.out.println("================================");

        int num4 = 44;

        num4 = num4 - 4;

        System.out.println(num4);
        System.out.println("======================");

        // Tasks:
        // create 5 variables and use all arithmetic operators,
        // add/subtract/multiplication/division/remainder to existing variables

        int numA = 15;
        numA = numA + 15;

        double numB = 45;
        numB = numB - 15;

        long numC = 28;
        numC = numC / 2;

        int numD = 34;
        numD = numD * 3;

        float numE = 12;
        numE = numE % 5;

//        System.out.println("numA "+ numA);
//        System.out.println("numB "+ numB);
//        System.out.println("numC "+ numC);
//        System.out.println("numD "+ numD);
//        System.out.println("numE "+ numE);


        System.out.println("numA "+ numA+"\n"+"numB "+numB+"\n"+"numC "+numC+"\n"+"numD "+numD+"\n"+"numE "+numE);
        String s = "numA "+ numA+"\n"+"numB "+numB+"\n"+"numC "+numC+"\n"+"numD "+numD+"\n"+"numE "+numE;

        System.out.println("=====================================================");


        boolean b1 = true;
        System.out.println(!b1);

        System.out.println("=====================================");
        boolean b2 = false;
        System.out.println(!b2);

        System.out.println("=========================");

        System.out.println(!true);
        System.out.println(!false);








    }
}
