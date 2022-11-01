package SkyPro.TheTwoCourse.CoursePaper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner);
                            break;
                        case 2:
                            // todo: обрабатываем пункт меню 2
                            break;
                        case 3:
                            // todo: обрабатываем пункт меню 3
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner) {

        // Заголовок, описание, тип и признак повторяемости обязательны к заполнению.

        System.out.print("Введите заголовок задачи: ");
        String headingName = scanner.next();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String descriptionName = scanner.next();

        int repeatability=0;
        do {
            System.out.print("Введите повторяемость задачи: 1/однократная,2/ежедневная,3/еженедельная,4/ежемесячная,5/ежегодная ");
            repeatability = scanner.nextInt();
        } while (!(repeatability>1 && repeatability<6));
        switch (repeatability){
            case 1:

            case 2:
            case 3:
            case 4:
            case 5:
        }




        // todo
    }

    private static void printMenu() {
        System.out.println(
                        "1. Добавить задачу \n"+
                        "2. Удалить задачу \n"+
                        "3. Получить задачу на указанный день \n"+
                        "0. Выход \n"
        );
    }
}
