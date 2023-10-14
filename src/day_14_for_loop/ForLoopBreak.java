package day_14_for_loop;

public class ForLoopBreak {
    public static void main(String[] args) {

        // break statement is used to break/exit out of the loop

        String str = "selenium";

        // Write a program to print first 5 chars from the string
        for (int i=0; i<= str.length()-1; i++){

            if (i == 5){
                break; // break the loop/exist the loop
            }
            else {
                System.out.println(str.charAt(i));
            }

        }
        System.out.println("Break if char == i");

        // write a program to print each char from the string, if char == 'u' break from the loop
        for (int i=0; i<= str.length()-1; i++){

            if (str.charAt(i) == 'e'){
                break; // breaks from the/ exists the loop
            } else{
                System.out.println(str.charAt(i));
            }
        }

    }
}
