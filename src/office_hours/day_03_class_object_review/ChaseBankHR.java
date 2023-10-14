package office_hours.day_03_class_object_review;

public class ChaseBankHR {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Mike Jake",1234, "QA Automation Engineer", 139000);

        ScrumTeam scrumTeam = new ScrumTeam();
        scrumTeam.hireTester(tester1);

        System.out.println(scrumTeam.testTeam);

        System.out.println("============================================");

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Aminbek Hasanov", 8888, "SDET", 159000);

        scrumTeam.hireTester(tester2);

        System.out.println(scrumTeam.testTeam);

        scrumTeam.fireTester(1234);

        System.out.println("=================================================");
        System.out.println(scrumTeam.testTeam);



    }
}
