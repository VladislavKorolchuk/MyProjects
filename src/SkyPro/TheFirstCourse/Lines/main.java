package SkyPro.TheFirstCourse.Lines;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String firstName = "Ivanov"; //для хранения имени
        String middleName = "Ivan"; //для хранения отчества
        String lastName = "Ivanovich"; //для хранения фамилии
        String fullName = firstName + ' ' + middleName + ' ' + lastName; // для хранения ФИО
        System.out.println("ФИО сотрудника —" + fullName + ".");
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase());
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));
    }
}
