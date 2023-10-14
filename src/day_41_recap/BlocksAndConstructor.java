package day_41_recap;

public class BlocksAndConstructor {

    public String name;

    public BlocksAndConstructor(){
        System.out.println("Constructor");
    }

    {
        name = "Testing";
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block "); // First
    }

    public static void main(String[] args) {
        System.out.println(new BlocksAndConstructor().name);
    }
}
