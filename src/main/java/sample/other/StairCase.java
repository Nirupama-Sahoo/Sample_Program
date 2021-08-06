package sample.other;

public class StairCase {
    long noOfWays(int n){
        long[] arr = new long[n+1];
        for(int i = 0; i <= n; i++){
            if(i < 2){
                arr[i] = 1;
            }
            else{
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
         return arr[n];
    }
    public static void main(String args[]){
        StairCase stairCase = new StairCase();
        System.out.println(stairCase.noOfWays(10));
    }

}

//0,1,1,2,3,4,7,11