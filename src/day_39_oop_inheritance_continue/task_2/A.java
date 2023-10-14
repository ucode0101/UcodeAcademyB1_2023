package day_39_oop_inheritance_continue.task_2;

public class A {
    int a = 100;

    public A(double b){
        System.out.println(this.a); // 100
    }

}
class B extends A{
    int a = 200;

    public B(){
        super(5.0);
        System.out.println(super.a);
        System.out.println(this.a);

    }

    public static void main(String[] args) {
        //A ojb = new A(3.3);

        B obj2 = new B();
    }


}