package objectsAndClasses;

import java.util.Objects;

public class Author {
    String nameAuthor;
    String surnameAuthor;
    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    @Override
    public String toString() {
        String info = "";
        info+= "\nИмя автора: "+ nameAuthor;
        info+= "\nФамилия автора: "+ surnameAuthor;
        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}
