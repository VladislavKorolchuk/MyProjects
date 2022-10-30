package SkyPro.TheTwoCourse.OOPLesson2;

class Flower {
    private String flowerColor; // Цвет цветка
    private String country; // Страна происхождения
    private Double cost; // Стоимость
    public int lifeSpan;// Срок стояния

    public Flower(String flowerColor, String country, Double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.toString() == "") {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.toString() == "") {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1.0;
        } else {
            this.cost = cost;
        }
        this.lifeSpan = lifeSpan;
    }

    public Flower(String flowerColor, String country, Double cost) {
        this(flowerColor,country,cost,3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}
