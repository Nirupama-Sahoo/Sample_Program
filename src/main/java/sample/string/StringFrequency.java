package sample.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFrequency {
    public static void main(String args[]){
        List<String> stringList = Arrays.asList("A","B","C","B","C","A","B","C","B");
        Map<String,Integer> frequency = new HashMap<>();

        for(String str : stringList){
            Integer count = frequency.get(str);
            if(count == null){
                count = 0;
            }
            frequency.put(str,count+1);
        }

        for (Map.Entry<String,Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
