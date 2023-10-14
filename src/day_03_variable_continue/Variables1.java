package day_03_variable_continue;

public class Variables1 {
    public static void main(String[] args) {
        System.out.println(12); // print statement you can print numbers as well

        int myNum = 100;

       // byte myByte = myNum;
        float f = 100.5f; // by default compiler takes any floating number as double

        double d = 5.5;
        d += myNum;
        System.out.println("+++++++++++++++++");
        System.out.println(d);



        String name = "Java";
        System.out.println(name + " Selenium");

        String name2 = "hello world";
        name2 += name;
        System.out.println(name2);
        System.out.println(name2+d);

        System.out.println("============================");

       // byte num = 2.5; byte, short, int, long take whole numbers only
       // byte b = 150; out of range

        String firstName = "Mike";
        String lastName = "Smith";

        System.out.println(firstName +" "+ lastName);

        int age = 25;
        String firstName3 = "Sara";
        String lastName3 = "Mike";

        System.out.println(firstName3+" "+lastName3+" "+age);

        byte b = 50;
        short s = 160;

        int i = b + s;

        System.out.println(i);


        System.out.println("Arithmatic operators");

        int salary = 10000;
        double weeklySalary = salary / 4;
        System.out.println(weeklySalary);

        int weeklyPay = 1790;

        long annualSalary = weeklyPay  * 52;
        System.out.println(annualSalary);

        System.out.println("====================");
        long monthlyPay = annualSalary / 12;
        System.out.println(monthlyPay);



        // how many kg is 50 pounds
        // 1 bound is equal to 500 grams
        // create a variable for that holds pounds
        // create another variable and divide kg by ?

        System.out.println("=======================");
        int pounds = 50;
        double kg = pounds / 2;
        System.out.println(kg);

        double usd;
        double tjkSomoni = 1000;
        // 1 sud == 10 somoni
        usd = tjkSomoni/10;
        System.out.println(usd);


        System.out.println("=====================");

        long ssn = 12345678;
        String strSsn =""+ssn;

        System.out.println(strSsn);

        System.out.println("=============================");

        int num = 10;
        int num2 = 20;
        String word =""+num+num2;
        int num3 = num+num2;

        System.out.println(word);
        System.out.println(num3);



    }
}
