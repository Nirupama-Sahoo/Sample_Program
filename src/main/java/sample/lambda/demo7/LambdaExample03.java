package sample.lambda.demo7;

import java.math.BigDecimal;
import java.util.List;

public class LambdaExample03 {
    interface  ProductFilter{
        boolean accept(Product product);
    }

    static void printProducts(List<Product> products, ProductFilter filter){
        for(Product product: products){
            if (filter.accept(product)){
                System.out.println(product);
            }
        }
    }
    public static void main(String args[]){
        List<Product> products = ExampleData.getProducts();
        BigDecimal priceLimit = new BigDecimal(5.00);

        ProductFilter filter = (product) -> product.getPrice().compareTo(priceLimit) < 0;
        printProducts(products,filter);

    }
}
