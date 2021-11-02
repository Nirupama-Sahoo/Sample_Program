package sample.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnstackingBoxes {
    static long getHeights(long n){
        long result = 0;
        List<Long> heights = new ArrayList<Long>();
        long left,right;
        int count = 0;
        for(int i = 0; i < n-1; i++){
            long item = heights.size() > 0 ? heights.get(i) : n;
            if(heights.size() > 0){
                heights.remove(i);
            }
            if(item % 2 == 0){
                long step = item/2;
                left = step;
                right = step;
                heights.add(count, left);
                heights.add(count, right);
            }else{
                left = 1;
                right = item - 1L;
                heights.add(0,left);
                heights.add(i == 0 ? 1:i,right);
                count++;
            }

            if(right >= 1){
                result = (left * right) + result;
            }
             System.out.println(result+"    "+ Arrays.toString(heights.toArray()));
        }
        System.out.println();
        return result;
    }
    public static void main(String args[]){
        String str = "7";
        long n = Long.parseLong(str);
        long result = getHeights(n);
        System.out.println(result);
        System.out.println();

    }
}
