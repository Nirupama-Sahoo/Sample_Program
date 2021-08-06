package sample.array;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.HashMap;

public class FindSubArray {

    ArrayList<SubArray> findSubArrays(int arr[], int n){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<SubArray> result = new ArrayList<SubArray>();
        int sum = 0;
       for(int i = 0; i < n; i++){

           ArrayList<Integer> list = new ArrayList<Integer>();

           sum = sum + arr[i];
           if(sum == 0){
               result.add(new SubArray(0,i));
           }

           if(map.containsKey(sum)){
               list = map.get(sum);
               for(int j = 0; j < list.size(); j++){
                   result.add(new SubArray(list.get(j)+1,i));
               }

           }
           list.add(i);
           map.put(sum,list);
       }
        return result;
    }
    public static void main(String args[]){
        int array[] = {6,3,-2,5,-3,7,-6,-1,4};
        FindSubArray findSubArray = new FindSubArray();
        ArrayList<SubArray> list = findSubArray.findSubArrays(array, array.length-1);
        for(SubArray subArray : list){
            for(int i = subArray.start ; i <= subArray.end; i++){
                System.out.println(array[i]);
            }
        }

    }
}
