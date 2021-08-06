package sample.array;

import java.util.Arrays;

public class NextGreaterNumber {
    static int[] findNextGreaterNumber(int[] array,int n){
        int i = 0;
        for (i = n; i > 0; i--){
            if(array[i] > array[i-1] ){
                break;
            }
        }
        int element = array[i-1], min = i;
        for(int j = i+1;j <n;j++){
            if(array[j] > element && array[j] < array[min]){
                min = j;
            }
        }
        swap(array,i-1,min);
        Arrays.sort(array,i,n);
        for(int start = 0 ; start <= n; start++ ){
            System.out.print(array[start]);
        }
        return  array;
    }

    private static int[] swap(int[] number, int start, int end) {

        int temp = number[start];
        number[start]= number[end];
        number[end] = temp;
        return  number;
    }
    public static void main(String args[]){
     int array[] = {2,1,8,7,6,5};
     findNextGreaterNumber(array, array.length-1);
    }
}
