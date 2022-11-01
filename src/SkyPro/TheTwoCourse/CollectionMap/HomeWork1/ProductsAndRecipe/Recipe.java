package SkyPro.TheTwoCourse.CollectionMap.HomeWork1.ProductsAndRecipe;

import java.util.Set;

public final class Recipe {
    private final String nameRecipe;
    private final Set<Product> productSet;

    public Recipe(String nameRecipe, Set<Product> productSet) {
        this.nameRecipe = nameRecipe;
        this.productSet = productSet;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public String toString() {
        return "Рецепт - " + nameRecipe +
                ", products=" + productSet;
    }

    // метод расчета стоимости продуктов
    public int costOfProducts() {
        int sum = 0;
        for (Product product : productSet) {
            sum = sum + product.getPrice() * product.getNum();
        }
        return sum;
    }

}
