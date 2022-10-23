package SkyPro.TheFirstCourse.CyclesPartOne;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнеее задание 1");
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nДомашнеее задание 2");
        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("\nЗадание 3");
        int j = 1;
        System.out.print("1 ");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nДомашнеее задание 3");
        System.out.println("Задание 1");
        int contribution = 29000; // Вклад
        int theAmountOfAccumulation = 0; // Cумма накопления
        for (int i = 1; i <= 12; i++) {
            theAmountOfAccumulation = theAmountOfAccumulation + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + theAmountOfAccumulation + " рублей");
            System.out.println("Месяц " + i + " сумма накоплений равна " + theAmountOfAccumulation + " рублей");
        }
        System.out.println("Задание 2");

        contribution = 29000; // Вклад
        theAmountOfAccumulation = 0; // Cумма накопления
        double contribution1 = 29000; // Вклад
        double theAmountOfAccumulation1 = 0; // Cумма накопления
        for (int i = 1; i <= 12; i++) {
            theAmountOfAccumulation = theAmountOfAccumulation += theAmountOfAccumulation / 100;
            theAmountOfAccumulation = theAmountOfAccumulation + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + theAmountOfAccumulation + " рублей");
            theAmountOfAccumulation1 = theAmountOfAccumulation1 += theAmountOfAccumulation1 / 100;
            theAmountOfAccumulation1 = theAmountOfAccumulation1 + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + String.format("%.2f", theAmountOfAccumulation1) + " рублей");
        }

    }
}

