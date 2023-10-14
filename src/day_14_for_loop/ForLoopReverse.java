package day_14_for_loop;

public class ForLoopReverse {
    public static void main(String[] args) {
        // Write program to reverse a string
        String str = "java";

        String reverse =""+ str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        System.out.println("Hard coded using charAt method");
        System.out.println(reverse);

        // store the length of the string
        int lastIndex = str.length()-1;
        String reverse2 ="";

        System.out.println("Dynamic using for loop");

        for (int i =str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
            reverse2 += str.charAt(i);
        }
        System.out.println();
        System.out.println("Stored in a String");
        System.out.println(reverse2);



    }
}
