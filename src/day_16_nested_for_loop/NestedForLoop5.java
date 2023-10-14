package day_16_nested_for_loop;

public class NestedForLoop5 {
    public static void main(String[] args) {

        //Task:
        // Write program to count frequency/number of chars in a string
        // "aaabbccddd" -> "a3b2c2d3"
        // Use nested for loop

        String str ="abcd";
        String result ="";



        for (int i=0; i< str.length(); i++){

            int count =0; // every time outer loop starts, this count variable will be reset to 0

            for (int j=0; j< str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){ // i =c and j =d

                    count ++;
                }

            }
            if (!result.contains(""+str.charAt(i))){
                result += str.charAt(i)+""+count;
            }

        }
        System.out.println(result);



    }
}
