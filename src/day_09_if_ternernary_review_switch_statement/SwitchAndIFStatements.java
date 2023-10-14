package day_09_if_ternernary_review_switch_statement;

public class SwitchAndIFStatements {
    public static void main(String[] args) {

        int dayOfWeek = 10;
        String str="";

        // Make sure the number is from 1 to 7
        if (dayOfWeek >=1 && dayOfWeek <=7){

            switch (dayOfWeek){ // Variable/expression

                case 1: // We are checking if the expression matches the case/ comparing variable value with multiple cases/value

                   str += "Monday";
                    break;
                case 2:
                    str += "Tue";
                    break;
                case 3:
                    str += "Wed";
                    break;
                case 4:
                    str += "Thu";
                    break;
                case 5:
                    str += "Fri";
                    break;
                case 6:
                    str += "Sat";
                    break;

                default:
                    str += "Sun";

            }

        }
        System.out.println(str);


    }
}
