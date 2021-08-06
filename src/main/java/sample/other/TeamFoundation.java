package sample.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamFoundation {
    static List<List<Integer>> lists = new ArrayList<>();
    public static int countTeams(List<Integer> skills, int minPlayers, int minLevel, int maxLevel) {
        // Write your code here
        int array[] = new int[skills.size()];
        int count = 0;
        for(int i = 0; i < skills.size() ; i++){
            if(skills.get(i) >= minLevel && skills.get(i) <= maxLevel){
                array[count++] = skills.get(i);
            }
        }

        printCombinationInLoop(array,count,minPlayers,count);
        return lists.size();
    }

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<r ; j++) {
                list.add(data[j]);
            }
            lists.add(list);
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
    /*static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }*/

    static void printCombinationInLoop(int arr[],int n,int minLevel,int size){
        for(int i = minLevel; i <= size; i++){
            int data[] = new int[i];
            combinationUtil(arr,data,0,n-1,0,i);
            //printCombination(arr,n,i);
        }
    }



    public static void  main(String args[]){
       List<Integer> list = Arrays.asList(12,4,6,13,5,10);
       int minPlayers = 3;
       int minLevel = 4;
       int maxLevel = 10;
       int count = countTeams(list,minPlayers,minLevel,maxLevel);
       System.out.println("Size "+count);
    }
}
