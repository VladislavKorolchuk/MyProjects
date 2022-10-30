// Гузовые автомобили
package SkyPro.TheTwoCourse.CollectionHash.Part2;

import java.util.ArrayList;
import java.util.List;

final class Truck extends Transport implements Diagnostics {

    private double engineCapacity; // Обьем двигателя
    private List<DriverC> driver=new ArrayList<>();

    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    void addDriver (DriverC driverC) {
        driver.add(driverC);
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMovement() {
        System.out.println("Закончить движение");
    }

    @Override
    String refill() {
        return null;
    }

    public void passDiagnostics() {
        System.out.println("");
    }

    void servise() {
        System.out.println("Грузовая машина на обслуживании:" + toString());
    }

    void  fixTheCar() {
        System.out.println("Грузовая машина в ремонте: " + toString());
    }

}
