package day_38_oop_inheritance;

public class EBook extends Book{
    /*
    inherited bellow fields
    String title;
    String type;
    String author;
    double price;
     */

    public String size;
    public int pages;

    public void readBook(){
        System.out.println("Reading "+ title+" By "+author);

    }
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author+"\nType: "+type+"\nPrice: $"+price+"\nSize: "+size+"\nPages: "+pages;
    }
}
