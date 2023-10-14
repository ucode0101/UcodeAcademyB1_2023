package day_53_map_enum_garbage_collection;

public enum EnumIntro {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class EnumTest{
    public static void main(String[] args) {
        EnumIntro abc = EnumIntro.WEDNESDAY;

        System.out.println(abc);

        System.out.println("=============");
        System.out.println(EnumIntro.FRIDAY);
        System.out.println(EnumIntro.MONDAY);


        System.out.println("=====================");

        String dayOfWeek = String.valueOf(EnumIntro.SUNDAY);
        System.out.println(dayOfWeek);

        System.out.println("============================");

       for (EnumIntro each : EnumIntro.values()){
           System.out.println(each);
       }

        System.out.println("==========================");

    }
}