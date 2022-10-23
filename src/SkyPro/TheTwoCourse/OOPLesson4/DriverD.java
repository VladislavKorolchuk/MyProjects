package SkyPro.TheTwoCourse.OOPLesson4;

class DriverD<D extends Bus> extends Driver {

    D car;

    public DriverD(String driverName, boolean drivingLicense, int drivingExperience, D car) {
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
