package day_34_statics_continue_instance_block;

public class Blocks {
    static {
      testStatic();
    }

    public static void testStatic(){
        System.out.println("Hello");
    }
    public void instanceTest(){
        System.out.println("Hell instance");
        testStatic();
        // instanceTest(); // We will tak about a method calling itself
    }

    public static void main(String[] args) {


    }
}
