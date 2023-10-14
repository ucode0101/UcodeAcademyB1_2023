package day_38_oop_inheritance.task_1;

public class EmployeeObject {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Smith James", 195000.00, 1234, "Developer");

        System.out.println(dev1);
        dev1.coding();
        System.out.println("================================================");

        Tester tester1 = new Tester("Sara James", 176000.50, 3333, "SDET");
        System.out.println(tester1);
        tester1.testing();

        System.out.println("======================================================");

        BusinessAnalyst bAnalyst = new BusinessAnalyst("Mark Smith", 155000.0, 7878, "BA");
        System.out.println(bAnalyst);
        bAnalyst.writingReq();




    }
}
