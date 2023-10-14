package day_12_string_class;

public class StringClassEqualsEqualsIgnoreCase {
    public static void main(String[] args) {

        // String is  an object that represents/takes sequence of char values.
        //String literal
        String str1 = "java"; // JVM checks String pool first if it doesn't exist, it will creat in String Pool

        // By new keyword/using new keyword
        String str2 = new String("java"); // It always creates a new String in Heap Memory

        System.out.println(str1 == str2); // true or false ?

        String str3 = "java";

        System.out.println(str1 == str3); // true or false ?

        String str4 = new String("java");

        System.out.println(str2 == str4); // true or false ?


        System.out.println("Using equals() methods...");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str4));

        System.out.println("==============================");
        String word ="5";

        boolean b = word.equals("5");

        System.out.println(b);

        System.out.println("===================================");

        System.out.println("java".equals("Java")); // false

        System.out.println("java".equalsIgnoreCase("JavA")); // true





    }
}
