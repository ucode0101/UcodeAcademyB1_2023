package day_07_if_nested_if_and_if_else_statements;

public class IfElseIfStatementPractice {
    public static void main(String[] args) {

        //The marks obtained by a student in 3 different subjects are input by the user.
        // Your program should calculate the average of subjects. The student gets a grade as per the following rules:
        //AVERAGE
        //GRADE
        //90-100
        //A
        //80-89
        //B
        //70-79
        //C
        //60-69
        //D
        //0-59
        //F


      // Assume that the max total grade/score is 100
        int math =51;
        int history=34;
        int geography = 19;

        int totalScore = math+history+geography;
        char grade;


        if (totalScore >=90 && totalScore <=100){
           grade ='A';
        }
        else if (totalScore >=80 && totalScore <90){
            grade = 'B';
        }
        else if (totalScore >=70 && totalScore <80){
            grade = 'C';
        }
        else if (totalScore >=60 && totalScore <70){
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("You grade score is: "+ grade);


        //


    }
}
