package SkyPro.TheTwoCourse.CollectionListsAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada", "Granta", 1.5);
        Car chevroletEpica = new Car("Chevrolet Epica", "V250", 1.8);
        Car lada = new Car("Lada", "2107", 1.3);
        Car hyundai = new Car("Hyundai", "Staria", 1.9);

        Truck kamaz = new Truck("КамАЗ", "5490", 6);
        Truck gaz = new Truck("ГАЗ", "22107", 4);
        Truck chana = new Truck("Chana", "SC1022DBN", 4);
        Truck fan = new Truck("FAW", "1031", 3);

        Bus gazel = new Bus("ГАЗЕЛЬ", "CITY", 7);
        Bus kavz = new Bus("КАВЗ", "4238", 6);
        Bus liaz = new Bus("ЛИАЗ", "5292", 6);
        Bus paz = new Bus("ВЕКТОР", "NEXT", 7.6);

        // DriverB driver1 = new DriverB("Иванов А.С.", true, 15, ladaGranta);
        DriverB driver1 = new DriverB("Иванов А.С.", true, 15, ladaGranta);
        DriverC driver2 = new DriverC("Петров В.А.", true, 9, kamaz);
        DriverD driver3 = new DriverD("Сидоров Д.В.", true, 5, gazel);

        System.out.println("Водитель" + driver1.toString() + "\nуправляет автомобилем " + driver1.car + " и будет участвовать в заезде");
        System.out.println("Водитель" + driver2.toString() + "\nуправляет автомобилем " + driver2.car + " и будет участвовать в заезде");
        System.out.println("Водитель" + driver3.toString() + "\nуправляет автомобилем " + driver3.car + " и будет участвовать в заезде");
        driver3.startMoving();
        driver3.stop();
        driver3.refuelTheCar();

        // ---------------------------------------------------------------------------------
        ladaGranta.addDriver(driver1);
        gaz.addDriver(driver2);
        liaz.addDriver(driver3);
        Sponsor sponsor1 = new Sponsor("Петров А.Ф.", 100000);
        Sponsor sponsor2 = new Sponsor("Чистяков К.А.", 670000);
        ladaGranta.addSponsor(sponsor1);
        ladaGranta.addSponsor(sponsor2);
        System.out.print("У автомобиля " + ladaGranta.toString() + "\n" + ladaGranta.numSponsor() + " спонсоров  ");

        for (Sponsor sponsor : ladaGranta.getSponsors()) {
            System.out.print(sponsor.getSponsorName());
        }
        // -------------------------------------------------------------------------------------
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(hyundai);
        serviceStation.addCar(lada);
        serviceStation.addCar(ladaGranta);
        serviceStation.maintenance();


        // -------- очередь в магазин----------------
        List<String> NAMES = List.of("Демидова О.С.", "Быченков А.В.", "Сидорова М.К.", "Трусов А.П.", "Сидоренко С.К.");
        Queue<String> cashRegister1 = new ArrayDeque<>();
        Queue<String> cashRegister2 = new ArrayDeque<>();
        cashRegister1.add(NAMES.get(4));
        cashRegister1.add(NAMES.get(1));
        cashRegister1.add(NAMES.get(3));
        cashRegister1.add(NAMES.get(2));
        cashRegister1.add(NAMES.get(0));

        cashRegister2.add(NAMES.get(1));
        cashRegister2.add(NAMES.get(2));
        cashRegister2.add(NAMES.get(3));
        cashRegister2.add(NAMES.get(4));

        System.out.println(cashRegister1.size());
        System.out.println(cashRegister2.size());


        if (cashRegister1.size() == 5 && cashRegister2.size() == 5) {
            System.out.println("Просьба позвать Галю");
        } else if (cashRegister1.size() < cashRegister2.size()) {
            addHuman(cashRegister1, NAMES.get(4));
        } else if (cashRegister1.size() > cashRegister2.size()) {
            addHuman(cashRegister2, NAMES.get(4));
        }

        System.out.println(cashRegister1.size());
        System.out.println(cashRegister2.size());

        // ------------------------------------------------------------------------------------

        example();
    }


    static void addHuman(Queue<String> queue, String name) {
        queue.add(name); // добавляем в очередь
    }

    static void example() {
        List<List<String>> biDemArrList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i + j) % 2 == 1 ? "х" : "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.printf("\n");
        }
    }

}