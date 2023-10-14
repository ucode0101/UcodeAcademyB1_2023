package day_41_recap;

public class InstanceVsStaticBlock {
    public String str = "Selenium";

    {
        System.out.println("Hello Instance");
    }
    static{
        System.out.println("Hello Static");
    }

    public static void main(String[] args) {

        InstanceVsStaticBlock obj = new InstanceVsStaticBlock();

        System.out.println(obj.str);

        System.out.println(new InstanceVsStaticBlock().str);


    }
}
