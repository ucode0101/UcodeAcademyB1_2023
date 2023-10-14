package day_39_oop_inheritance_continue;

public class ThisKeywords {

    public ThisKeywords(){
        System.out.println("I'm default constructor");
    }

    public ThisKeywords(int s){
        this();
    }
    public ThisKeywords(String str){
        this(4);
        System.out.println(str);
    }

    public static void main(String[] args) {
        ThisKeywords object = new ThisKeywords("Java");
    }

}
