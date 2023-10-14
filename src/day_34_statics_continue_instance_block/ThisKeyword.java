package day_34_statics_continue_instance_block;

public class ThisKeyword {

    String name ="java";
    int id = 123;
    String s; // this variable has null as default value


    public void setInfo(String name, int id){

        if (this.name == null){

            this.name = name;
        }
        if (this.id == 0){
            this.id = id;
        }



    }
}
