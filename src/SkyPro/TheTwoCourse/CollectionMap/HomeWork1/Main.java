package SkyPro.TheTwoCourse.CollectionMap.HomeWork1;

import SkyPro.TheTwoCourse.CollectionMap.HomeWork1.ProductsAndRecipe.Product;
import SkyPro.TheTwoCourse.CollectionMap.HomeWork1.ProductsAndRecipe.ProductList;
import SkyPro.TheTwoCourse.CollectionMap.HomeWork1.ProductsAndRecipe.Recipe;
import SkyPro.TheTwoCourse.CollectionMap.HomeWork1.ProductsAndRecipe.RecipeList;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        // -------------------------------------------  Задание 1 --------------------------------------------------
        String surnameAndName;
        String numberPhone;
        HashMap<String, String> telephoneDirectory = new HashMap<>();

        telephoneDirectory.put("Иванов А.П.", "+7(921)-56-87");
        telephoneDirectory.put("Петров.С.Н", "+7(921)-66-88");
        telephoneDirectory.put("Сидоров Н.К.", "+7(921)-55-34");
        telephoneDirectory.put("Демидова М.К.", "+7(921)-44-21");
        telephoneDirectory.put("Корольчук В.В.", "+7(921)-44-43");
        telephoneDirectory.put("Васильев С.П.", "+7(921)-58-34");
        telephoneDirectory.put("Быченков А.В.", "+7(921)-12-55");
        telephoneDirectory.put("Александров Р.Н.", "+7(921)-75-23");
        telephoneDirectory.put("Тимченко А.П.", "+7(921)-34-45");
        telephoneDirectory.put("Каткова О.С.", "+7(921)-87-23");
        telephoneDirectory.put("Тритьяков П.Н.", "+7(921)-67-45");
        telephoneDirectory.put("Шабардин А.Р.", "+7(921)-44-66");
        telephoneDirectory.put("Николаев К.К.", "+7(921)-56-44");
        telephoneDirectory.put("Расторгуев К.В.", "+7(921)-67-55");
        telephoneDirectory.put("Пугачев А.В.", "+7(921)-87-23");
        telephoneDirectory.put("Путин А.В.", "+7(921)-77-45");
        telephoneDirectory.put("Лебедев Р.П.", "+7(921)-36-45");
        telephoneDirectory.put("Гусев А.Р.", "+7(921)-46-66");
        telephoneDirectory.put("Шойгу Т.П.", "+7(921)-75-11");
        telephoneDirectory.put("Литвинов К.К.", "+7(921)-55-34");
        System.out.println(telephoneDirectory);

        // -------------------------------------------------  Задание 2 -----------------------------------------------
        ProductList productList = new ProductList();
        RecipeList recipeList = new RecipeList();

        Product product1 = new Product("Масло сливочное 1 кг.", 150, 40);
        productList.addProduct(product1, product1.getNum());
        Product product2 = new Product("Масло подсолнечное 1 кг.", 120, 40);
        productList.addProduct(product2, product1.getNum());
        Product product3 = new Product("Сахар 1000 кг.", 60, 40);
        productList.addProduct(product3, product1.getNum());
        Product product4 = new Product("Мука 1 кг", 130, 40);
        productList.addProduct(product4, product1.getNum());

        // ------------------------ Рецепты -------------------------------------
        Recipe recipes1 = new Recipe("Пирог", Set.of(product1, product3));
        recipeList.addRecipe(recipes1);
        Recipe recipes2 = new Recipe("Торт", Set.of(product2, product4));
        recipeList.addRecipe(recipes2);
        System.out.println(recipes1.toString());


        // --------------------------------------- Задание 3 -----------------------------------------------------------

        hashMap("str1", 4);
       // hashMap("str2", 4);
       // hashMap("str2", 4);
       // hashMap("str2", 7);

    }

    final static void hashMap(String line, int num) {
        
       // String Result = String.valueOf((hashMap.get(line)));
        if (String.valueOf((hashMap.get(line))) == "null") {         // Бакет не найден
            hashMap.put(line, num);
        } else if (hashMap.get(line) == num) {                       // Выкинуть исключение
            throw new IllegalArgumentException("Повтор ключ-значения");
        } else {                                                     // Перезаписываем
            hashMap.put(line, num);
        }
    }

}
