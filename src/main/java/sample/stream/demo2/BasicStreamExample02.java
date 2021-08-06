package sample.stream.demo2;

import sample.lambda.demo7.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamExample02 {
    List<Product> products = ExampleData.getProducts();

    Stream<Product> stream = products.stream();

    String[] array = new String[]{"one","two","three"};

    Stream<String> stringStream = Arrays.stream(array);
}
