package sample.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(10);


        list.add(3);
        list.add(3);
        list.add(10);
        System.out.println("Size  :"+list.size());

        list.add(1, 25);
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    if(list.contains(3)){
        System.out.println("TRUE");
    }
    }
}
