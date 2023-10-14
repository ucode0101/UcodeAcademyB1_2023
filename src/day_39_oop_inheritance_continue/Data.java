package day_39_oop_inheritance_continue;

public class Data {
    public static String publicData = "Public access";
    protected static String protectedData = "Protected access";
    static String defaultData = "Default access";
    private String privateData = "Private access";
    String str = "Java";

   public static String getPrivateData(){
       return protectedData;
   }
}
