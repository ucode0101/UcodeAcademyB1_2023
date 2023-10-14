package day_15_for_loop_continue;

import java.util.Scanner;

public class CountAandBInString {
    public static void main(String[] args) {
        // Write a program to ask user to enter a string/sentence and count 'a' and 'b' ignore lower/upper case
        // jabavab => a == 3, b == 2

        int countA=0;
        int countB=0;

        System.out.println("Please enter a string sentence");
        String str = "";
        Scanner scan = new Scanner(System.in);

        str = scan.nextLine();
        str = str.toLowerCase();

        for (int i=0; i< str.length(); i++){
            if (str.charAt(i) == 'a')  {

                countA++;
            }
            else if (str.charAt(i) =='b'){
                countB++;
            }
        }
        System.out.println("A count: "+countA+"\nB count: "+countB);
    }
}
