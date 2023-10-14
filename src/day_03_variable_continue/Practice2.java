package day_03_variable_continue;

public class Practice2 {
    public static void main(String[] args) {

        double radius = 5.5;
        double area = radius * radius;
        double perimeter = 2 * radius;
        System.out.println(area);
        System.out.println(perimeter);

        System.out.println("============================");

        /*
        1. Write a Java program that displays the area and perimeter of a circle that has a radius of 5.5 using
        the following formulas:
        perimeter = 2 * radius * ! area = radius * radius * !


       2. Write a Java program that displays the area of a rectangle with a width of 4.5 and a
        height of 7.9 using the following formula: area = width * height

      3. Write a Java program that calculates the average of 3 numbers.
         */

        int num1 = 20;
        int num2 = 30;
        int num3 = 10;

        int average = (num1+ num2 + num3) / 3;

        System.out.println(average);

        System.out.println("==============================");

        double width = 4.5;
        double height = 7.9;

        double area2 = width * height;
        System.out.println(area2);


    }
}
