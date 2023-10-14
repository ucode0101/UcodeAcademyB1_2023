package day_38_oop_inheritance;

public class BookObject {

    public static void main(String[] args) {
        EBook book1 = new EBook();

        book1.title = "Tojikon";
        book1.type = "eBook";
        book1.author = "Bobojon Gafurov";
        book1.price = 100;
        book1.size = "2.3MB";
        book1.pages = 378;


        System.out.println(book1);

        System.out.println("=======================================");
        book1.readBook();

        System.out.println("=======================================");

        AudioBook book2 = new AudioBook();

        book2.title ="Born Crime";
        book2.author ="Trevor Noah";
        book2.price = 49.5;
        book2.type ="Audio book";
        book2.length = "8 hours and 45 minutes";

        System.out.println(book2);



    }
}
