package SkyPro.TheFirstCourse.CyclesPartTwo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        int month = 1; // Месяц
        int amountOfSavings = 0; // Сумма накоплений, изначально 0
        while (amountOfSavings <= 2459000) {
            amountOfSavings = amountOfSavings + 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amountOfSavings + "рублей");
            month++;
        }
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("Задание 3");
        long totalNumber = 12000000l; // Общая численность
        int birthRateYear = 12000000 / 1000 * 17; //Рождаемость составляет 17 человек на 1000 человек
        int mortalityYear = 12000000 / 1000 * 8;   //Смертность составляет 8 человек на 1000 человек
        for (int j = 1; j <= 10; j++) {
            totalNumber = totalNumber + birthRateYear - mortalityYear;
            System.out.println("Год " + j + ", численность населения составляет " + totalNumber);
        }
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        double amountOfSavingsVasilii = 15000;
        for (int month1 = 1; ; month1++) {
            System.out.println(String.format("Месяц " + month1 + ", сумма накоплений " + String.format("%.2f", amountOfSavingsVasilii)));
            if (amountOfSavingsVasilii > 12000000) {
                break;
            }
            amountOfSavingsVasilii = amountOfSavingsVasilii + (amountOfSavingsVasilii / 100 * 7);
        }
        System.out.println("Задание 2");
        // Вывод каждого шестого месяца
        double amountOfSavingsVasilii1 = 15000;
        for (int month1 = 1; ; month1++) {
            if (month1 % 6 == 0) {
                System.out.println(String.format("Месяц " + month1 + ", сумма накоплений " + String.format("%.2f", amountOfSavingsVasilii1)));
            }
            if (amountOfSavingsVasilii1 > 12000000) {
                break;
            }
            amountOfSavingsVasilii1 = amountOfSavingsVasilii1 + (amountOfSavingsVasilii1 / 100 * 7);
        }
        System.out.println("Задание 3");
        double amountOfSavingsVasilii2 = 15000;
        for (int month1 = 1; month1 <= (12 * 9); month1++) {
            if (month1 % 6 == 0) {
                System.out.println(String.format("Месяц " + month1 + ", сумма накоплений " + String.format("%.2f", amountOfSavingsVasilii2)));
            }
            amountOfSavingsVasilii2 = amountOfSavingsVasilii2 + (amountOfSavingsVasilii2 / 100 * 7);
        }
        System.out.println("Задание 4");
        int firstFriday = 4; // число первой пятницы
        do {
            System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет.");
            firstFriday = firstFriday + 7;
        }
        while (firstFriday <= 31);
        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        int currentYear = 2022;
        for (int yearComet = 0; yearComet <= currentYear + 79; yearComet += 79) {
            if (yearComet >= currentYear - 200) {
                System.out.println(yearComet);
            }
        }
        System.out.println("Задание 2");
        // Таблица умножения на 2
        for (int j = 1; j <= 10; j++) {
            System.out.println(" 2*" + j + "=" + 2 * j);
            System.out.println("2*" + j + "=" + 2 * j);
        }
    }
}
