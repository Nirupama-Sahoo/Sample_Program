package sample.stream.demo2;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import sample.lambda.demo7.Category;
import sample.lambda.demo7.Product;

import java.util.List;

public class BasicStreamExample03 {
    public static void main(String args[]){
        List<Product> products = ExampleData.getProducts();
        products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .forEach(System.out::println);

        products.stream()
                .map(product -> String.format("The Price of %s is $ %2.f",product.getName(),product.getPrice()))
                .forEach(System.out::println);

    }
}
