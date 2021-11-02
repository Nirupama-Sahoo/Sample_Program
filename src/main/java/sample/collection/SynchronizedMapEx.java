package sample.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMapEx {

    public static void main(String args[]){
        // Creating a HashMap
        HashMap<Integer, String> hmap
                = new HashMap<Integer, String>();

        // Adding the elements using put method
        hmap.put(10, "Geeks");
        hmap.put(20, "for");
        hmap.put(30, "Geeks");
        hmap.put(25, "Welcome");
        hmap.put(40, "you");

        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        // Creating a synchronized map
        Map map = Collections.synchronizedMap(hmap);
        Set set = map.entrySet();

        synchronized (map)
        {
            Iterator i = set.iterator();
            // Printing the elements
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
        }

    }
}
