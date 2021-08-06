package sample.lambda.demo7;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LambdaExample07 {
    interface ProductFactory{
        Product create(Category category, String name, BigDecimal price);
    }
    static boolean isExpensive(Product product){
        return product.getPrice().compareTo(new BigDecimal("5.00")) > 0;
    }
    public static void main(String args[]){
        List<Product> products = ExampleData.getProducts();
       // products.forEach(product -> System.out.println(product));
       // products.removeIf(LambdaExample07::isExpensive);

        products.forEach(System.out :: println);

        // Stream<String> productNames =  products.stream().map(product -> product.getName());

        Stream<String> productNames =  products.stream().map(Product::getName);
        productNames.forEach(System.out :: println);

        ProductFactory factory = Product:: new;
        Product blueberries = factory.create(Category.FOOD,  "Blueberries", new BigDecimal("6.95"));
        System.out.println(blueberries);

        System.out.println("=============Ascending Order=======");
        products.stream().map(Product::getPrice).sorted().forEach(System.out::println);

        System.out.println("=============Descending Order=======");
        products.stream().map(Product::getPrice).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
