package sample.lambda.demo7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample04 {
    public static void main (String args[]){
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");
        int numberOfCheapProducts = 0;
        List<Product> chepProduct = new ArrayList<>();
        /*for (Product product: products){
            if(product.getPrice().compareTo(priceLimit) < 0)
            numberOfCheapProducts++;
        }*/

        products.forEach(product ->  {
            if(product.getPrice().compareTo(priceLimit) < 0){
                chepProduct.add(product);
            }
        });

        System.out.println("The are "+ numberOfCheapProducts +" cheaper product");
    }
}
