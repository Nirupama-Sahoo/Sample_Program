package sample.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PossibleSum {
    public static List<List<Integer>> combinationSum(int array[],int target){
        List<Integer> currList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        int index = 0;
        combinationSum(array,target,currList,result,sum,index);
        return  result;
    }
    public static void combinationSum(int array[],int target,List<Integer> currList,List<List<Integer>> result,int sum,int index){
        if(sum > target){
            return;
        }else if(sum == target){
            Collections.sort(currList);
            if(!result.contains(currList)){
                result.add(new ArrayList<>(currList));
            }
        }else{
            for(int i = index; i <array.length; i++){
                currList.add(array[i]);
                combinationSum(array,target,currList,result,sum + array[i],index);
                currList.remove(currList.size()-1);
            }
        }

    }
    public static void main(String args[]){
        int array[] = {1,2,3};
        List<List<Integer>> result = combinationSum(array,4);
        for(List<Integer> list : result){
            for(Integer num : list){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
