// легковые автомобили
package SkyPro.TheTwoCourse.Enum;

final class Car extends Transport implements Competing {

    private double engineCapacity;
    private String transmission;
    //private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean rubber;
    private BodyType bodyType;

    public Car(String brand, String model, double engineCapacity, BodyType bodyType) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
        this.bodyType = bodyType;
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
    public void pitStop() {
        System.out.println("Класс Легковые автомобили Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Класс Легковые автомобили Лучшее время круга");
    }

    @Override
    public void voidmaximumSpeed() {
        System.out.println("Класс Легковые автомобили Максимальная скорость");
    }

    @Override
    public String toString() {
        String str = bodyType == null ? "тип автомобиля Данных недостаточно" : bodyType.name();
        return super.toString() + ", объем двигателя " + engineCapacity + " " + str;
    }

    // Метод определить тип авто
    boolean DetermineTypeCar(BodyType bodyType) {
        if (bodyType == this.bodyType) {
            return true;
        } else {
            return false;
        }

    }

}