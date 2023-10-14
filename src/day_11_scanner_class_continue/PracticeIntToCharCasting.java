package day_11_scanner_class_continue;

public class PracticeIntToCharCasting {

    public static void main(String[] args) {
        // Every letter/char is represented by a number in ASCII table, 97 to 122 represent lower case a-z

        int num = 112;
        char ch =' ';

        if (num >=97 && num <= 122){
            ch = (char) num;
        }
        else {
            System.out.println("The number is not in the range");
        }



    }
}
