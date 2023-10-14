package day_43_exceptions_continue_final;

public class CustomException3 extends RuntimeException{

    public CustomException3(){
        super("Break Time Exception!");
    }

    public static void main(String[] args) {


        throw new CustomException3();
    }
}

class JavaException extends InterruptedException{

    public JavaException(String str){
       super(str);

    }

    public static void main(String[] args) throws JavaException {



        throw new JavaException("Java is throwing some exception");
    }

}