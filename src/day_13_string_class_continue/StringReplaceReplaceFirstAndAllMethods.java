package day_13_string_class_continue;

public class StringReplaceReplaceFirstAndAllMethods {
    public static void main(String[] args) {

        String str = "java and java and api and selenium with java";

        String str2 = str.replace("and","or");

        System.out.println(str2);

        String str3 = "java.api,javaapi.ia";

        String str4 = str3.replaceFirst("and","or");

        System.out.println(str4);

        System.out.println("===================================");

        //String str5 = str3.replace("ia","o");// doesn't work string doesn't have ia

        String str5 = str3.replaceAll("[,.&^%$#$#$478509324khds;lasf'ljkg]"," ");
        System.out.println(str5);

        System.out.println("===========================================");


        String a ="He is doing some java";

        String str6=a.replaceAll ("[is]","was");
        // this will replace i with was and s with was
        // using regex [] it doesn't check is the given regex/string together or seperate
        // it assumes that all given regex [luljghjg] are seperate

        String word = "974597239475932745";
        // Small Task:
        // Replace all number with char using replace all method

        String result = word.replaceAll("&%.,-=[0-9]","Hello");
        System.out.println(result);

        String word2 = "We, are doing some, java";

        // we will do more practice with regex it is not today's topic
        word2 = word2.replaceAll("[,]","?");
        System.out.println(word2);





    }
}
