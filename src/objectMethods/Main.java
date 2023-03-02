package objectMethods;


import objectsAndClasses.Author;
import objectsAndClasses.Book;


public class Main {
    public static void main(String[] args) {

        Author author = new Author("Ирина", "Космическая");
        Author author1 = new Author("Кирилл", "Кофеевич");
        Book book = new Book("Космос",author, 2022);
        Book book1 = new Book("Кофе",author1, 200);

        Book book2 = new Book("Космос", new Author("Ирина", "Космическая"), 2022);
        System.out.println("Проверка метода toString");
        System.out.println(book);
        System.out.println(book1);
        System.out.println();
        System.out.println(author);
        System.out.println(author1);
        System.out.println();
        System.out.println("Проверка метода equals(book и book1)");
        System.out.println(book.equals(book1));
        System.out.println("Проверка метода equals(book и book2)");
        System.out.println(book.equals(book2));
        System.out.println("Проверка метода hashCode(book1,2,3)");
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());



    }
}