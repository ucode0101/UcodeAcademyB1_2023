package day_37_review_and_oop_encapsulation;

public class EncapsulationPerson2 {

    private String firstName;
    private String lastName;
    private long ssn;

    public EncapsulationPerson2(String firstName, String lastName, long ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public long getSsn(){
        return ssn;
    }

}
