// Легковые автомобили
package SkyPro.TheTwoCourse.CollectionListsAndQueues;

import java.util.ArrayList;
import java.util.List;

final class Car extends Transport implements Diagnostics {

    private double engineCapacity;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean rubber;

    private List<DriverB> driver = new ArrayList<>();


    public Car(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double engineCapacity, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean rubber) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.engineCapacity = engineCapacity; // Обьем двигателя
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
    }

    public Car(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    void addDriver (DriverB driverB) {
        driver.add(driverB);
    }

    @Override
    public String toString() {
        return super.toString() + " обьем двигателя=" + engineCapacity;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }


    public boolean isRubber() {
        return this.rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    String refill() {
        return "можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }

    @Override
    public void passDiagnostics() {
        System.out.println("");
    }

    void servise() {
        System.out.println("\nМашина на обслуживании:" + toString());
    }

    void fixTheCar() {
        System.out.println("\nМашина в ремонте: " + toString());
    }

}
