package SkyPro.TheTwoCourse.CollectionMap.HomeWork1.ProductsAndRecipe;

import java.util.HashMap;
import java.util.HashSet;

public final class RecipeList {
    final private HashSet<Recipe> recipeHashSet = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        recipeHashSet.add(recipe);
    }

}
