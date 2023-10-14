package day_09_if_ternernary_review_switch_statement;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        String str ="";
        char ch = 'U';

        // switch statement works without break, but we will have logical error
        // IT is always a good practice to use break statement, other we get logical error
        switch (ch){


            case 'A':
                str += "A";
                break;

            case 'B':
                str += "B";
                break;

            case 'C':
                str += "C";
                break;

            default:
                str +="Invalid";


        }

        System.out.println(str); //


        System.out.println("=================================");



    }
}
