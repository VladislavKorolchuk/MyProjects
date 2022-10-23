package SkyPro.TheFirstCourse.ObjectMethods;

import java.util.Objects;

public class Author {
    protected String nameAuthors; // Имя автора
    protected String surnameAuthors; // Фамилия автора

    public Author(String nameAuthors, String surnameAuthors) {
        this.nameAuthors = nameAuthors;
        this.surnameAuthors = surnameAuthors;
    }

    public String getNameAuthors() {

        return nameAuthors;
    }

    public String getSurnameAuthors() {

        return surnameAuthors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthors, author.nameAuthors) && Objects.equals(surnameAuthors, author.surnameAuthors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthors, surnameAuthors);
    }
}
