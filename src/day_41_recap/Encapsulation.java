package day_41_recap;

public class Encapsulation {
    private String name;
    private long ssn;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSsn(long ssn){
        this.ssn = ssn;
    }
    public long getSsn(){
        return ssn;
    }
}
