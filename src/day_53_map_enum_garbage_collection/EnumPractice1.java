package day_53_map_enum_garbage_collection;

public enum EnumPractice1 {

    LOW,
    MEDIUM,
    HIGH,


}

class TestEnum{

    public static void main(String[] args) {
        EnumPractice1 var = EnumPractice1.MEDIUM;

        switch (var){
            case LOW:
                System.out.println("Low");
                break;
            case HIGH:
                System.out.println("High");
            case MEDIUM:
                System.out.println("Medium");
                break;
        }
        System.out.println("=========================");

       EnumPractice1 [] abc = EnumPractice1.values();
        for (EnumPractice1 each : abc){
            System.out.println(each);
        }
    }
}
