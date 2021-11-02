package sample.stream.demo2;

import sample.lambda.demo7.Category;
import sample.lambda.demo7.Product;

import java.util.List;
import java.util.Optional;

public class BasicStreamExample04 {
    public static void main(String args[]){
        List<Product> products = ExampleData.getProducts();

        Optional<Product> opt =  products.stream()
                .filter(product -> product.getCategory() == Category.OFFICE)
                .findAny();
        opt.ifPresent(System.out::println);

    }
}
