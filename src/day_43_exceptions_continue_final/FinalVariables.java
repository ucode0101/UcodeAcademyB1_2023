package day_43_exceptions_continue_final;

public class FinalVariables {
    // This final variable cannot be changed or modified once initialized
    final static String MONDAY = "Monday";
    // This is not final variable can be changed or modified
    static String monday = "Monday";
    final int DAY_OF_THE_WEEK = 7;

    // final Array, we can change modify individual elements, but not the whole array
    final static String [] DAYS_OF_THE_WEEK = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    static String[] abc ={"Mon","Tue"};

    public static void main(String[] args) {

        //monday = "abc"; // it can be changed/modified
       // MONDAY = "abc"; // it cannot be changed/modified
        abc = new String[]{"Fri","Sat"}; // we can change/modify
      //DAYS_OF_THE_WEEK= new String[]{"ab","ab"}; // we cannot change modify

        //DAYS_OF_THE_WEEK[0] = "ABC"; // We can change/modify individual elements
    }


}
