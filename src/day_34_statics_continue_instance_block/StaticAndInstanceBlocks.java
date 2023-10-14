package day_34_statics_continue_instance_block;

public class StaticAndInstanceBlocks {

    {
        System.out.println("I'm in instance block");// 4
        test();                                     // 5
        System.out.println("Hello, I am instance block"); // 6
    }

    static {

        System.out.println("I'm in static block"); // 1
        test();                                    // 2 and it will print whatever that methods has
        System.out.println("Hello, I am static block"); // 3
    }

    public static void test(){
        System.out.println("I'm static method");
    }

    public static void main(String[] args) {

        StaticAndInstanceBlocks obj1 = new StaticAndInstanceBlocks();
    }
}
