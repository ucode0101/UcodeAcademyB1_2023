package day_34_statics_continue_instance_block;

public class StaticBlock {

    static String name;
    static int id;

    static {
//        System.out.println("Setting up driver and browser...");
//        System.out.println("Setting up credentials");
        name = "Java";
        id = 123;
    }

    public static void main(String[] args) {
       // System.out.println("Login to the website");
        System.out.println(StaticBlock.name);
        System.out.println(StaticBlock.id);

    }
}
