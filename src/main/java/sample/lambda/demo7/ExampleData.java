package sample.lambda.demo7;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExampleData {
    private  static  final List<Product> PRODUCTS = Arrays.asList(
            new Product(Category.FOOD,"Oranges", new BigDecimal("1.65")),
            new Product(Category.FOOD,"Gouda cheese", new BigDecimal("6.79")),
            new Product(Category.UTENSILS,"Plates", new BigDecimal("12.95")),
            new Product(Category.CLEANING,"Detergent", new BigDecimal("3.79")),
            new Product(Category.FOOD,"Soft Drink", new BigDecimal("1.99")),
            new Product(Category.OFFICE,"Pencils", new BigDecimal("5.79")),
            new Product(Category.FOOD,"Rice", new BigDecimal("2.99")),
            new Product(Category.CLEANING,"Scourer", new BigDecimal("2.29")),
            new Product(Category.FOOD,"Milk", new BigDecimal("1.39")),
            new Product(Category.OFFICE,"Note Book", new BigDecimal("4.99")),
            new Product(Category.FOOD,"Tea", new BigDecimal("4.29")),
            new Product(Category.FOOD,"Tomato sauce", new BigDecimal("1.39")),
            new Product(Category.FOOD,"Peanut Butter", new BigDecimal("2.39")),
            new Product(Category.FOOD,"Red Bell Pepper", new BigDecimal("0.99")),
            new Product(Category.UTENSILS,"Spoons", new BigDecimal("14.95")),
            new Product(Category.OFFICE,"Adhesive tape", new BigDecimal("5.39")),
            new Product(Category.CLEANING,"Dish Brush", new BigDecimal("3.49")),
            new Product(Category.UTENSILS,"Knives", new BigDecimal("9.95")),
            new Product(Category.FOOD,"Brown bread", new BigDecimal("3.99")),
            new Product(Category.FOOD,"Patatos", new BigDecimal("1.59")),
            new Product(Category.CLEANING,"Dishcloth", new BigDecimal("2.59")),
            new Product(Category.FOOD,"Apples", new BigDecimal("1.29")),
            new Product(Category.OFFICE,"Ball Point Pens", new BigDecimal("6.79")),
            new Product(Category.UTENSILS,"Forks", new BigDecimal("14.95"))
    );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }
}
