// Тип для легковых автомобилей
package SkyPro.TheTwoCourse.Enum;

public enum BodyType {
    SEDAN("Седан"),HATCHBACK("Хатчбег"),CUPE("Купе"),UNIVERSAL("Универсал"),VNEDOROGNIC("Внедорожник"),CROSSOVER("Кроссовер"),
    PICAP ("Пикап"),FURGON("Фургон"),MINIVEN("Минивен");

    String bodyType;
    BodyType(String bodyType) {
        this.bodyType=bodyType;
    }

    public String getbodyType() {
        return bodyType;
    }

}
