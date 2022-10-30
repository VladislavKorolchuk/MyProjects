// Гузовые автомобили
package SkyPro.TheTwoCourse.WorkingWithExceptions.Part2;

import SkyPro.TheTwoCourse.OOPLesson4.Competing;

final class Truck extends Transport implements Diagnostics {

    private double engineCapacity; // Обьем двигателя

    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
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

}
