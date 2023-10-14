package day_35_constructors_intro;

public class StudentsTest {
    public static void main(String[] args) {

        Students s1 = new Students("Jame Bond",34, 'M');
        System.out.println(s1);

        System.out.println("===========================");

        Students s2 = new Students();

        System.out.println(s2);

        System.out.println("===========================");


        Students s3 = new Students("Sara");

        System.out.println(s3);

        System.out.println("===========================");

        Students s4 = new Students("Mark", 55);
        System.out.println(s4);

        System.out.println("===========================");


    }
}
