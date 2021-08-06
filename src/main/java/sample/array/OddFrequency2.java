package sample.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OddFrequency2 {

   static int findOddFrequencyNumber(int array[], int n){
       int result = 0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int i =0; i <n ; i++){
           Integer count = map.get(array[i]);
           if(map.containsKey(array[i])){
               map.put(array[i], count+1);

           }else
           {
               map.put(array[i], 1);
           }

       }

       Set<Map.Entry<Integer,Integer>> set = map.entrySet();
       for(Map.Entry<Integer,Integer> entry : set){
           if(entry.getValue() % 2 != 0){
               result = entry.getKey();
           }

       }

        return  result;
    }

    public static void main(String args[]){
        int array[] = {2,4,5,2,4,4,5,5,5,3,3};
        System.out.print(findOddFrequencyNumber(array,array.length));

    }
}
