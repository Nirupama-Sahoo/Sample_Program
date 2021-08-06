package sample.lambda.demo7;

import java.util.Comparator;
import java.util.List;

public class LambdaExample01 {
    public static void main (String args[]){
        List<Product> products = ExampleData.getProducts();
        //Lambda Expression
        //products.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));

        //Block Lambda
        products.sort((p1,p2) -> {
            return p1.getPrice().compareTo(p2.getPrice());
        });
        for(Product product : products){
            System.out.println(product);
        }
    }
}
