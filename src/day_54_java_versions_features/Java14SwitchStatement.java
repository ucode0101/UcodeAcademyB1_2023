package day_54_java_versions_features;

public class Java14SwitchStatement {
    public static void main(String[] args) {

        int days =0;
        String month ="Feb";

        // Using switch statement/expression before Java 14
        switch (month){
            case "Jan":
                days =31;
                break;
            case "Feb":
                days = 28;
            case "Mar":
                days = 31;
                break;
            case "Apr":
                days = 30;
                break;
            case "May":
                days = 31;
                break;
            case "Jun":
                days = 30;
                break;
            case "Jul":
                days = 31;
                break;
            case "Aug":
                days = 31;
                break;
            case "Sept":
                days = 30;
                break;
            case "Oct":
                days = 31;
                break;
            case "Nov":
                days = 30;
                break;
            case "Dec":
                System.out.println("Hello");
                days = 31;
                break;
            default:
                days = 0;
        }

        // from Java 14 and Up
        days = switch (month){
            case "Jan","Mar","May","Jul","Aug","Oct","Dec" -> {
                System.out.println("Hello");
               yield 31;
            }
            case "Feb" -> 28;
            case "Apr","Jun","Sep","Nov" -> 30;

            default -> 00;
        };

        System.out.println(days);
    }
}
