package day_09_if_ternernary_review_switch_statement;

public class IfTernarySwitchPractice {
    public static void main(String[] args) {
        // HTTP Protocol/API Status Code
        // 200 -> OK
        // 201 -> Created
        // 202 -> Accepted
        // 301 -> Moved Permanently
        // 303 -> See Other

        // Write a program that print/displays the message based on statue code

        int statusCode = 303;
        String message ="";

        // With switch Statement
        switch (statusCode){

            case 200:
                message += "OK";
                break;

            case 201:
                message += "Created";
                break;
            case 202:
                message += "Accepted";
                break;
            case 301:
                message += "Moved Permanently";
                break;
            case 303:
                message += "See Other";
                break;
            default:
                message +="Invalid Status Code";


        }
        System.out.println(message);

        System.out.println("=========================================================");

        String msg1 ="";

        // With If else
        if (statusCode == 200){
            msg1 +="OK";

        }
        else if (statusCode == 201){
            msg1 += "Created";
        }
        else if (statusCode == 202){
            msg1 +="Accepted";
        }
        else if (statusCode == 301 ){
            msg1 += "Moved Permanently";
        }
        else if (statusCode == 303 ){
            msg1 += "See Other";
        }
        else {
            msg1 += "Invalid Status Code";;
        }

        System.out.println(msg1);


        System.out.println("=============================================");

        String msg2 ="";
        // Using Ternary Operator
        msg2 = (statusCode == 200) ? "Ok" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Accepted" :
                (statusCode == 301) ? "Moved Permanently" : (statusCode == 303) ? "See Other" : "Invalid Status Code";

        System.out.println(msg2);

        System.out.println("=============================================");
        String msg3 ="";

        // Single if Statement and else (I wouldn't do it this when I can use if else,switch,ternary)
        if (statusCode == 200){
            msg3 +="OK";

        }
        if (statusCode == 201){
            msg3 += "Created";
        }
       if (statusCode == 202){
            msg3 +="Accepted";
        }
        if (statusCode == 301 ){
            msg3 += "Moved Permanently";
        }
       if (statusCode == 303 ){
            msg3 += "See Other";
        }
        else {
            msg3 += "Invalid Status Code";;
        }

        System.out.println(msg3);





    }
}
