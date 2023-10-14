package day_48_oop_and_exception_review;

public class Encapsulation {
    private long ssn;
    private String name;
    private String accountNumber ="343434343";

    public void setSsn(long ssn){
        this.ssn = ssn;
    }
    public long getSsn(){
        return ssn;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public String getAccountNumber(){
        return accountNumber;
    }

}

class TestEncapsulation{

    public static void main(String[] args) {
        Encapsulation object1 = new Encapsulation();
       // object1.method1();
        //object1.ssn ="ssn";
        object1.setSsn(2222222);
        System.out.println(object1.getSsn());

        object1.setName("Java");
        String str = object1.getName();
        System.out.println(str);

        System.out.println(object1.getAccountNumber());

    }

}