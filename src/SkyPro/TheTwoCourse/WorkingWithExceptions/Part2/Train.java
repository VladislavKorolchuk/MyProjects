// Поезда
package SkyPro.TheTwoCourse.WorkingWithExceptions.Part2;

import java.time.LocalDate;

final class Train extends Transport {

    private double priceOfTrip;
    private LocalDate travelTime;
    private String nameOfDepartureStation;
    private String finalStop;
    private int numberOfWagons;
    private static final String errInfo = "Информация не указана";

    public Train(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double priceOfTrip, LocalDate travelTime, String nameOfDepartureStation, String finalStop, int numberOfWagons) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.priceOfTrip = priceOfTrip;
        this.travelTime = travelTime;
        this.nameOfDepartureStation = nameOfDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    double getPriceOfTrip() {
        return this.priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    LocalDate getTravelTime() {
        return this.travelTime;
    }

    void setTravelTime(LocalDate travelTime) {
        this.travelTime = travelTime;
    }

    String getNameOfDepartureStation() {
        return this.nameOfDepartureStation;
    }

    void setNameOfDepartureStation(String nameOfDepartureStation) {
        this.nameOfDepartureStation = nameOfDepartureStation != null && !nameOfDepartureStation.isBlank() ? nameOfDepartureStation : "Информация не указана";
    }

    String getFinalStop() {
        return this.finalStop;
    }

    void setFinalStop(String finalStop) {
        this.finalStop = finalStop != null && !finalStop.isBlank() ? finalStop : "Информация не указана";
    }

    int getNumberOfWagons() {
        return this.numberOfWagons;
    }

    void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public String toString() {
        String var10000 = this.getBrand();
        return "Поезд " + var10000 + " модель " + this.getModel() + ", год производства " + this.getYearOfRelease() + ", страна сборки " + this.getCountryOfManufacture() + ", скорость передвижения " + this.getMaximumMovementSpeed() + ", отходит от  " + this.getNameOfDepartureStation() + ", и следует до станции " + this.getFinalStop() + ", цена поездки " + this.getPriceOfTrip() + ", в поезде " + this.getNumberOfWagons() + " вагонов.";
    }

    String refill() {
        return "нужно заправлять дизелем";
    }

}
