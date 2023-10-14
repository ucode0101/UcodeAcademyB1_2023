package day_09_if_ternernary_review_switch_statement;

public class SwitchStatementPractice2 {

    public static void main(String[] args) {
        // Write  a program to check the number
        // if the number is less than 10
        // use switch statement to find that number
        // assume the number is less than 10
        // print one for 1, two for 2, three for 3...
        //

        int num =-7;
        String str ="";

        if ( num < 10) {

            switch (num) {

                case 1:
                    str += "One";
                    break;
                case 2:
                    str += "Two";
                    break;
                case 3:
                    str += "Three";
                    break;
                case 4:
                    str += "Four";
                    break;
                case 5:
                    str += "Five";
                    break;

                default:
                    str += "I only used 1 to 5, because I'm lazy";


            }
        }


        System.out.println(str);








    }
}
