package SkyPro.TheTwoCourse.OOPLesson3;

final class Bus extends Transport {
    public Bus(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
    }

    public String toString() {
        return this.getBrand() + " " + this.getModel() + ", цвет кузова  " + this.getBodyColor() + ", год производства " + this.getYearOfRelease() + ", страна сборки " + this.getCountryOfManufacture() + ", максимальная скорость " + this.getMaximumMovementSpeed();
    }

    String refill() {
        return "можно заправлять бензином или дизелем на заправке";
    }
}
