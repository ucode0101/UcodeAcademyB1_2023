package day_14_for_loop;

public class ForLoopPractice2 {

    public static void main(String[] args) {
        // Write a program to print each char from string

        String str = "seleniumseleniumseleniumseleniumseleniumseleniumseleniumselenium";
        int strLength = str.length()-1;

        System.out.println("Printing all 'e' with charAt method");

        for (int index = 0; index <= str.length()-1; index++){

           if (str.charAt(index) == 'e'){ // index == 1

               System.out.println(str.charAt(index));
           }
        }

        System.out.println("Printing all 'e' with substring methods");

       //str.substring(1, 2);


        for (int i=0; i <= str.length()-1; i++){

            //str.substring(0,1); // 0,1

            if (str.substring(i, i+1).equals("e")){

                System.out.println(str.substring(i,i+1));
            }

        }




    }
}
