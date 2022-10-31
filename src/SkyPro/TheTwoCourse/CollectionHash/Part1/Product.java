package SkyPro.TheTwoCourse.CollectionHash.Part1;

import java.util.Objects;

final class Product {
    private final String nameProduct;      // Название номенклатуры
    private int price;                     // Цена
    private int num;                       // Количество товара
    private boolean chesk;                 //признак купленного товара

    public Product(String nameProduct, int price, int num) {
        if (nameProduct == null || nameProduct.isEmpty() || price <= 0 || num < 0) {
            throw new IllegalArgumentException("Введите корректные данные");
        }
        this.nameProduct = nameProduct;
        this.price = price;
        this.num = num;
        this.chesk = false;        // товар не куплен
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isChesk() {
        return chesk;
    }

    public void setChesk() {
        this.chesk = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }

    @Override
    public String toString() {
        return "Номенклатура - " +
                "nameProducts='" + nameProduct +
                ", цена=" + price +
                ", количетво=" + num + " кг."+
                ", товар куплен =" + (chesk ? "куплен" : "не куплен");
    }

}
