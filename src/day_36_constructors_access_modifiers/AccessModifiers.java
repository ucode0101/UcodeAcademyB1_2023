package day_36_constructors_access_modifiers;

 public class AccessModifiers {
    public String name1; // This instance variable can be accessed from any package

     String name2; // This instance variable can be accessed within the same package only

     protected String name3; // This instance variable can be accessed within the same package
                            // but it can be inherited from any package

     private String name4; // This instance variable can be accessed with this class only


    public void method1() { // This instance method can be accessed/called from any package

    }
    void method2(){ // This instance method can be accessed/called within the same package

    }
    protected void method3(){ // This instance method can be accessed/called within the same package,
                             // but it can be inherited from any package
    }
    private void method4(){ // This instance method can be called/accessed within/in this class only

    }

    // known as nested or inner class
    private class Test1{

    }
     // known as nested or inner class
    class  Test2{

    }
     // known as nested or inner class
    protected class Test3{

    }
     // known as nested or inner class
    public class Test4{

    }
}

