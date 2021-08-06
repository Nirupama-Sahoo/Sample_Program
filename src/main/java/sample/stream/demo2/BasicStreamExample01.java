package sample.stream.demo2;

import sample.lambda.demo7.Product;

import java.util.List;
import java.util.stream.Stream;

public class BasicStreamExample01 {
    public static void main(String args[]){
        List<Product> products = ExampleData.getProducts();

        Stream<Product> stream =  products.stream().map(product ->{
            System.out.println(product);
           return product;
        });
        stream.forEach(product -> {});
    }
}
