package SkyPro.TheTwoCourse.OOPLesson1;
 class Car {

    String brand; // марка
    String model; // модель
    String engineVolume; // объем двигателя в литрах
    String color; // цвет кузова
    int productionYear; // год производства
    String productionCountry; // страна сборки

    Car(String brand, String model, String engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "";
        } else {
            this.model = model;
        }
        if (engineVolume == null) {
            this.engineVolume = "1,5";
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "";
        } else {
            this.productionCountry = productionCountry;
        }
    }
}
