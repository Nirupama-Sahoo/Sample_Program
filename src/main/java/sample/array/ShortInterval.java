package sample.array;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ShortInterval {
    int count = 0;
    public int solve(List<Integer> arr) {
       List<List<Integer>> lists = new ArrayList<>();

       for(int i = 0; i < arr.size(); i++){
           List<Integer> list = new ArrayList<>();
           list.add(arr.get(i));
           lists.add(list);
           if(i+1 == arr.size()){
               break;
           }

           if(arr.get(i) <= arr.get(i+1) ){
               List<Integer> newList = new ArrayList<>();
               newList = lists.get(lists.size()-1);
               newList.add(arr.get(i+1));
               lists.add(newList);

           }
       }

       return lists.size();
    }


    public static void main(String args[]){
        ShortInterval shortInterval = new ShortInterval();
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        System.out.println("Count "+ shortInterval.solve(arr));

    }
}
