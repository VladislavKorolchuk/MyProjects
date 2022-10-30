package SkyPro.TheTwoCourse.WorkingWithExceptions.Part1;

public class Main {
    public static void main(String[] args) {

        ClassDate classDate = new ClassDate();
        try {
            classDate.metod("asdf?", "111", "68098908098");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка в пароле");
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
