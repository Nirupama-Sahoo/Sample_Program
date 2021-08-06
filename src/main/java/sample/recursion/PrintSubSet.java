package sample.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSet {
    List<List<Integer>> output = new ArrayList<>();
    int size = 2;
    public void backtrack(int first, ArrayList<Integer> curr,int array[]){

        if(curr.size() == size){
           output.add(new ArrayList<>(curr));
           for(int i =first; i < array.length; i++ ){
               curr.add(array[i]);
               backtrack(i+1, curr,array);
               curr.remove(curr.size()-1);
           }
        }

    }
    public List<List<Integer>> subsets(int[] array){
        int n = array.length;
        for(int k = 0; k <n+1; ++k){
            backtrack(0,new ArrayList<Integer>(), array);
        }
        return output;

    }
    public  static void main(String args[]){
    PrintSubSet printSubSet = new PrintSubSet();
    int array[] = {1,2,3};
        List<List<Integer>> result =  printSubSet.subsets(array);
        for(List<Integer> list : result){
            for(Integer num : list){
                System.out.print(num);
            }
            System.out.println();
        }

    }
}
