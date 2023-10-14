package day_41_recap;

public class TestEncapsulation extends Encapsulation{

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        // System.out.println(obj.name); // we cannot access instance variable that has private access modifier outside the class
        obj.setName("Java");
        System.out.println(obj.getName());
        obj.setSsn(989898989);
        System.out.println(obj.getSsn());
    }

}
