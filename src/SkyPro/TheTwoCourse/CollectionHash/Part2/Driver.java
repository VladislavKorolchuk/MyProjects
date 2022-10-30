package SkyPro.TheTwoCourse.CollectionHash.Part2;

abstract class Driver<T> {

    private final String driverName;          // ФИО» водителя
    private final boolean drivingLicense;     // Наличие водительских прав
    private final int drivingExperience;       // Стаж

    public Driver(String driverName, boolean drivingLicense, int drivingExperience) {
        this.driverName = driverName;
        this.drivingLicense = drivingLicense;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return " " + driverName;
    }

    abstract void startMoving();

    abstract void stop();

    abstract void refuelTheCar();

}
