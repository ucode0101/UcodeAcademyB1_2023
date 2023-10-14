package day_09_if_ternernary_review_switch_statement;

public class SwitchStatement {

    public static void main(String[] args) {

        char ch ='a';

        switch (ch){

            case 'a':
                System.out.println("It is A");
                break;


            case 'b':
                System.out.println("It is B");
                break;


            case 'c':
                System.out.println("It is C");
                break;


            default:
                System.out.println("It is either D Or some other character");

        }

        System.out.println("======================================");

        //2.Write a program to display days:
        //1-Monday 2-Tuesday
        //3- Wednesday 4-Thursday 5-Friday 6-Saturday
        // Assume the number is from 1 to 7

        int weekDay = 6;

        switch (weekDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("The number is either bellow 1 or above 7");
        }
    }
}
