// Автобусы
package SkyPro.TheTwoCourse.WorkingWithExceptions.Part2;

final class Bus extends Transport implements Competing {

    private double engineCapacity; // Обьем двигателя

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Класс Автобус Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Класс Автобус Лучшее время круга");
    }

    @Override
    public void voidmaximumSpeed() {
        System.out.println("Класс Автобус Максимальная скорость");
    }

    @Override
    String refill() {
        return null;
    }

}
