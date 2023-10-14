package day_33_static_and_static_block;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;

    public void setInfo(String location, String company, double salary, boolean isFullTime){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }
    public String toString(){
        return "Company: "+company+" Location: "+location+" Salary: "+salary+" Is full time: "+isFullTime;
    }

    public static void main(String[] args) {
        Offer offer = new Offer();
        offer.setInfo("NYC","Google",145000.00, true);
        System.out.println(offer);

    }
}
