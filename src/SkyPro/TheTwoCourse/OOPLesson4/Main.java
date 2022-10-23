package SkyPro.TheTwoCourse.OOPLesson4;

public class Main {
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

    }
}
