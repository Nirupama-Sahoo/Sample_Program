package sample.other;

import java.util.List;

public class MinimumMoves {
    public static  int minimumMoves(List<Integer> arr1, List<Integer> arr2){
        int arr1Length = arr1.size();
        int count = 0;
        if(arr1.size() != arr2.size()){
            throw new RuntimeException();
        }
        for(int i = 0 ; i < arr1Length; i++){
        String str1 = String.valueOf(arr1.get(i));
        String str2 = String.valueOf(arr2.get(i));
          for(int j = 0; j< str1.length(); j++){
                int aValue = Integer.parseInt(Character.toString(str1.charAt(j)));
                int bValue = Integer.parseInt(Character.toString(str2.charAt(j)));
             if(aValue > bValue ){
                    count += aValue - bValue;
                }else{
                    count += bValue - aValue;
                }
            }
        }
        return  count;
    }

    public static void main(String args[]){

    }
}
