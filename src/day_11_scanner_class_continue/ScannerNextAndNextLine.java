package day_11_scanner_class_continue;

import java.util.Scanner;

public class ScannerNextAndNextLine {
    public static void main(String[] args) {

        // next(); takes a single word until space/it takes whatever comes before the space
        // nextLine(); takes everything including spaces
        // When next() or nextLine() and assign the value to String


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String sentence = input.nextLine();

        System.out.println(sentence); // what is it going to print/display
    }
}
