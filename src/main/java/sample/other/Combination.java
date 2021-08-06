package sample.other;

import java.util.ArrayList;
import java.util.List;

class Combination {

    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static List<List<Integer>> lists = new ArrayList<>();
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<r ; j++) {
                list.add(data[j]);
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            lists.add(list);

            return;
        }


        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }


    static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    static void printCombinationInLoop(int arr[],int n){
        for(int i = 3; i <5; i++){
            printCombination(arr,n,i);
        }
        System.out.println("Size  :"+lists.size());
    }
    /*Driver function to check for above function*/
    public static void main (String[] args) {
        int arr[] = {4,6,5,10};
        int r = 5;
        int n = arr.length;
        //printCombination(arr, n, r);
        printCombinationInLoop(arr,n);
    }
}
