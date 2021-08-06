package sample.stream.demo2;

import sample.lambda.demo7.Category;
import sample.lambda.demo7.Product;

import java.util.List;
import java.util.stream.Collectors;

public class BasicExample05 {
    public static void main(String args[]){
        List<Product> products = ExampleData.getProducts();

        List<String> foodProductName =  products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .map(Product::getName)
                .collect(Collectors.toList());

        String categories = products.stream()
                .map(Product::getCategory)
                .distinct()
                .map(Category::name)
                .collect(Collectors.joining(","));
        System.out.println(categories);

    }
}
