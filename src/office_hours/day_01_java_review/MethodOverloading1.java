package office_hours.day_01_java_review;

import java.util.Arrays;

public class MethodOverloading1 {

    public static void main(String[] args) {
        String str = "dbcaefk";


        str = sort(str);
        System.out.println(str);

        System.out.println("==============================");
        System.out.println(sort(str));

        System.out.println("======================================");

        char [] chArr = {'d','a','e','c','i'};

        chArr = sort(chArr);

        System.out.println(Arrays.toString(chArr));

        System.out.println("==================================================");

        String [] strArray = {"selenium","testing","java","api","zxy"};

        strArray = sort(strArray);

        System.out.println(Arrays.toString(strArray));

    }

    public static String sort(String str){

        char [] ch = str.toCharArray(); // convert to char array

        Arrays.sort(ch); // sort char array

        str = new String(ch); // assign sorted char array as  string as new value

      return str; // return the result as string

    }

    public static char[] sort(char [] chArray){
        //Arrays.sort(chArray);  // easy and fast way using sort() method

        for (int i=0; i<chArray.length; i++){

            for (int j=i; j<chArray.length; j++){  // {'d','a','e','c','i'};

                if (chArray[i] > chArray[j]){ // bca

                    char temp = chArray[i];
                    chArray[i] = chArray[j]; //
                    chArray[j] = temp;


                }

            }

        }


        return chArray;
    }

    public static int [] sort(int [] arr){
        Arrays.sort(arr);

        return arr;
    }

    public static String [] sort(String [] strArr){

        //Arrays.sort(strArr); // does not sort each string element alphabetically in place

        for (int i=0; i<strArr.length; i++){{

            char [] ch = strArr[i].toCharArray();
            Arrays.sort(ch);

            String temp = new String(ch);

            strArr[i] = temp;
        }

        }

        return strArr;
    }


}
