package objectsAndClasses;

import java.util.Objects;

public class Book {
    // Создали новый класс Book (Книга)
    private String name;
    // Объявили свойство name (Название книги)
    private int age;
    // Объявили свойство age (Год публикации книги)
    private Author author;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Author getAuthor() {
        return this.author;
    }


    public void setAge(int age) {

        this.age = age;

    }

    @Override
    public String toString() {
        String info = "";
        info += "\nНазвание книги: " + "«"+ name+ "»";
        info += "\nГод Выпуска: " + age;
        info += "\nАвтор книги: " + author.nameAuthor+" "+ author.surnameAuthor;

        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, author);
    }
}




