package day_38_oop_inheritance;

public class AudioBook extends Book{
      /*
    inherited bellow fields
    String title;
    String type;
    String author;
    double price;
     */

    public String length;
    public void listen(){
        System.out.println("Listening "+title);
    }
    public String toString(){
        return "Title: "+title+"\nType:"+type+"\nAuthor: "+author+"\nPrice: $"+price+"\nLength: "+length;
    }
}
