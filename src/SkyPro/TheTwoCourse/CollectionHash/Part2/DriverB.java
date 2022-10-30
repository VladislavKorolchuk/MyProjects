package SkyPro.TheTwoCourse.CollectionHash.Part2;

class DriverB<B extends Car> extends Driver {

    B car;

    public DriverB(String driverName, boolean drivingLicense, int drivingExperience, B car) {
        super(driverName, drivingLicense, drivingExperience);
        this.car = car;
    }

    @Override
    void startMoving() {
        System.out.println("начать движение");
    }

    @Override
    void stop() {
        System.out.println("остановиться");
    }

    @Override
    void refuelTheCar() {
        System.out.println("заправить авто");
    }

}
