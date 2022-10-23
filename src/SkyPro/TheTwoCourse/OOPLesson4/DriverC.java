package SkyPro.TheTwoCourse.OOPLesson4;

class DriverC<C extends Truck> extends Driver {

    C car;

    public DriverC(String driverName, boolean drivingLicense, int drivingExperience, C car) {
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
