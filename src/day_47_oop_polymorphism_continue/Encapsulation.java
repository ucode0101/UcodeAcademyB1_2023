package day_47_oop_polymorphism_continue;

public class Encapsulation {

    private String name;
    private int age;
    private static String ssn = "222-22-2222";

    public String getSsn(){
        return ssn;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){
        return age;
    }

}

class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("Java");
        System.out.println(obj.getName());

        obj.setAge(22);
        System.out.println(obj.getAge());
        System.out.println(obj.getSsn());


    }
}