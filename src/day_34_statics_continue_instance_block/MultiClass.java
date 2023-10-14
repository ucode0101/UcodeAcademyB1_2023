package day_34_statics_continue_instance_block;

public class MultiClass {
    String name;
    public static void main(String[] args) {
        System.out.println("Hello, I am the main class");
    }
}

 class MultiClass2{
     public static void main(String[] args) {
         MultiClass obj = new MultiClass();
         obj.name = "Java";
         System.out.println(obj.name);

     }


}
