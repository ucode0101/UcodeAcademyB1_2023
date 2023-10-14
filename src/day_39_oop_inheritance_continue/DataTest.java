package day_39_oop_inheritance_continue;

public class DataTest extends Data{

    public void testSuperKeyword(){
        System.out.println(super.str);

    }


    public static void main(String[] args) {

        System.out.println(DataTest.publicData);
        System.out.println(DataTest.protectedData);
        System.out.println(DataTest.defaultData);
        System.out.println(DataTest.getPrivateData());



    }
}
