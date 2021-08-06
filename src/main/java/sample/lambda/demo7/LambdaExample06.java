package sample.lambda.demo7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LambdaExample06 {

    public static void main (String args[]) {

        List<Product> products = ExampleData.getProducts();

        try(FileWriter writer = new FileWriter("products.txt")){
            for (Product product: products){
                writer.write(product.toString() + "\n");
            }
        }catch (IOException e){
            System.out.println("Exception occured "+e.getMessage());
        }

    }
}
