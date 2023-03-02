package objectsAndClasses;



public class Main {
    public static void main(String[] args) {
        Book book = new Book("Космос", new Author("Ирина", "Космическая"), 2022);
        Book book1 = new Book("Кофе", new Author("Кирилл", "Кофеевич"), 200);

       System.out.println("Название первой книги: " + "«" + book.getName() + "»");
        System.out.println("Год выпуска: " + book.getAge());
        System.out.println("Автор книги: " + book.getAuthor().getNameAuthor() + " " +  book.getAuthor().getSurnameAuthor());
        System.out.println();
        System.out.println("Название второй книги: " + "«" + book1.getName() + "»");
        System.out.println("Год выпуска: " + book1.getAge());
        System.out.println("Автор книги: " + book1.getAuthor().getNameAuthor() + " " +  book1.getAuthor().getSurnameAuthor());
        book1.setAge(1985);
        System.out.println("Исправленный год выпуска во второй книге на: " + book1.getAge());
        System.out.println();

    }
}
