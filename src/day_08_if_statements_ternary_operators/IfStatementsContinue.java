package day_08_if_statements_ternary_operators;

public class IfStatementsContinue {
    public static void main(String[] args) {
        // Warm up task:
        /*
        write a program that can find the number of days in a month
        use if else statements
	 	(Assume that Feb has 28 days)

	 		Example -> int month = 1; it's December and it has 31 days
      if(month ==1){
         print(it has 31 days)
      } if else()....

			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
         */

        int month = 11;

        if (month <1 || month >12){
            System.out.println("Sorry, number should be from 1 to 12");
        }
        else if (month == 1){
            System.out.println("31 days");
        }
        else  if (month == 2){
            System.out.println("28 days");
        }
        else if (month == 3){
            System.out.println("31 days");
        }
        else if (month ==4){
            System.out.println("30 days");
        }
        else if (month == 5){
            System.out.println("31 days");
        }
        else if (month == 6){
            System.out.println("30 days");
        }
        else if (month == 7){                         //30 days: 4,6,9,11
                                                      // 31 days: 1,3,5,7,8,10,12
            System.out.println("30");
        }
        else if (month == 8){
            System.out.println("31 days");
        }
        else if (month == 9){
            System.out.println("30 days");
        }
        else if (month == 10 ){
            System.out.println("31 days");
        }
        else if (month == 11){
            System.out.println("30 days");
        }
        else {
            System.out.println("31 days");
        }





    }
}
