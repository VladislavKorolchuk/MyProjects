package SkyPro.TheTwoCourse.Enum;

abstract class Transport {

    private String brand;                        // - Марка
    private String model;                        // - Модель


    static private final String errInfo = "Информация не указана";

    Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = (brand == null || brand.isBlank()) ? errInfo : brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = (model == null || model.isBlank()) ? errInfo : model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    abstract String refill();

}
