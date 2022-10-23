package SkyPro.TheFirstCourse.ObjectsAndClasses;

public class Book {
    private String Author;  // Автор
    private int yearPublication;  // Год публикации

    public Book(String Author, int yearPublication) {
        this.Author = Author;
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
