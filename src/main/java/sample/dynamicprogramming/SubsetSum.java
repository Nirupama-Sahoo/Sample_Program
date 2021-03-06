package sample.dynamicprogramming;

public class SubsetSum {
    public  static int subSetSum(int[] set, int sum){
        int n = set.length;
        int matrix[][] = new int[n+1][sum+1];
        for(int i = 0; i <=n; i++){
            matrix[i][0] = 1;
        }
        for(int j = 0; j<=sum; j++){
            matrix[0][j] =0;
        }
        for(int i = 1; i<= n; i++){
            for(int j =1; j<= sum; j++){
                if(set[i-1] > j){
                    matrix[i][j] = matrix[i-1][j];
                }else{
                    matrix[i][j] = matrix[i-1][j] +
                            matrix[i-1][j-set[i-1]];
                }
            }
        }

    return matrix[n][sum];
    }
    public static void main(String args[]){
        int[] num = {1,2,3,4};
        System.out.println(subSetSum(num, 8));

    }

    public static class FibonacciWithDynamicProgramming {
    }
}
