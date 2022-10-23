package SkyPro.TheFirstCourse.ObjectsAndClasses;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book1 = new Book("Елена", 2012); // Кулик Елена
        Book book2 = new Book("Иван", 2020); // Городецкий Иван

        System.out.format("Книга 1 Автор %s  Год издания %d \n", book1.getAuthor(), book1.getYearPublication());
        System.out.format("Книга 2 Автор %s  Год издания %d \n", book2.getAuthor(), book2.getYearPublication());

        Author author1 = new Author("Елена", "Кулик");
        Author author2 = new Author("Иван", "Городецкий");

        System.out.format("Автор %s %s \n", author1.getNameAuthors(), author1.getSurnameAuthors());
        System.out.format("Автор %s %s \n", author2.getNameAuthors(), author2.getSurnameAuthors());


        book2.setYearPublication(2022);
        System.out.format("Книга 2 Автор %s  Год издания %d \n", book2.getAuthor(), book2.getYearPublication());
    }
}
