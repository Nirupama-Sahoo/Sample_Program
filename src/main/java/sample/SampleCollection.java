package sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleCollection {
public static void main(String args[]){
    List<Item> items = new ArrayList<>();
    items.add(new Item("Apple",10,new BigDecimal(9.99)));
    items.add(new Item("Bannana",10,new BigDecimal(29.99)));
    items.add(new Item("Orange",10,new BigDecimal(29.99)));
    items.add(new Item("Watermelon",10,new BigDecimal(19.99)));
    items.add(new Item("Bannana",10,new BigDecimal(29.99)));
    items.add(new Item("Guva",10,new BigDecimal(19.99)));
    Map<String,List> map = new HashMap<>();

   // items.stream().collect(Collectors.groupingBy(Item::getPrice)).put(Item::getPrice, Item::getName);


}

}
