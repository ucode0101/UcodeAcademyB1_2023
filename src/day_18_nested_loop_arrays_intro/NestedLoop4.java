package day_18_nested_loop_arrays_intro;

public class NestedLoop4 {
    public static void main(String[] args) {
        // Task:
        // Find frequency of character in a string
        // "aaabbbccdd" ==> a3b3c2d2

        String str ="aaabbbccdd";

        String result ="";

        int i =0;

        while (i <str.length()){
            int j=0;
            int count=0;

            do {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
                j++;
            } while (j<str.length());

            if (!result.contains(""+str.charAt(i))){
                result +=str.charAt(i)+""+count;
            }
            i++;

        }
        System.out.println(result);

    }
}
