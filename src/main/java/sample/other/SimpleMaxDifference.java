package sample.other;

import java.util.Arrays;
import java.util.List;

public class SimpleMaxDifference {
    public static int maxDifference(List<Integer> px) {
        // Write your code here
        int count = 0;
       /* int length = px.size();
        int arr[] = new int[length];
        for (int i =0; i < px.size(); i++)
            arr[i] = px.get(i);*/

        for(int i = px.size()-1; i >= 0; i-- ){
            for(int j = i-1; j >=0; j--){
                if(px.get(i) > px.get(j) ){
                    if(px.get(i) - px.get(j) > count){
                        count = px.get(i) - px.get(j);
                    }
                }

            }
        }

        return count > 0 ? count : -1;
    }
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(7,9,5,6,3,2);
        System.out.println(maxDifference(list));
    }

}
