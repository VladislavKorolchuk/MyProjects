package SkyPro.TheFirstCourse.ObjectsAndClasses;

public class Author {
    private String nameAuthors; // Имя автора
    private String SurnameAuthors; // Фамилия автора

    public Author(String nameAuthors, String SurnameAuthors) {
        this.nameAuthors = nameAuthors;
        this.SurnameAuthors = SurnameAuthors;
    }

    public String getNameAuthors() {
        return this.nameAuthors;
    }

    public String getSurnameAuthors() {
        return this.SurnameAuthors;
    }
}