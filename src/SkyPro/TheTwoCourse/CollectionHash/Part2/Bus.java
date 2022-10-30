// Автобусы
package SkyPro.TheTwoCourse.CollectionHash.Part2;

import java.util.ArrayList;
import java.util.List;

final class Bus extends Transport implements Competing {

    private double engineCapacity; // Обьем двигателя

    private List<DriverD> driver=new ArrayList<>();

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    void addDriver (DriverD driverD) {
        driver.add(driverD);
    }

    @Override
    public void pitStop() {
        System.out.println("Класс Автобус Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Класс Автобус Лучшее время круга");
    }

    @Override
    public void voidmaximumSpeed() {
        System.out.println("Класс Автобус Максимальная скорость");
    }

    @Override
    String refill() {
        return null;
    }

    void servise() {
        System.out.println("Автобус в обслуживании не нуждается");
    }

    void  fixTheCar() {
        System.out.println("Автобу в ремонте: " + toString());
    }

}
