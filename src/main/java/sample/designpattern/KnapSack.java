package sample.designpattern;

public class KnapSack {
    private static int knapSackValue(int weight[],int value[], int knapShakWeight){
        int n = weight.length;
        if(n <= 0 || knapShakWeight<= 0){
            return 0;
        }
        int matrix[][] = new int[n][knapShakWeight+1];
        for(int j = 0; j<=n; j++){
            matrix[0][j] = 0;
        }
         for(int i = 1; i <= weight.length; i++){
                for(int j = 1; j <= knapShakWeight ; j++){
                  if(weight[i-1] > j){
                      matrix[i][j] = matrix[i-1][j];
                  }else{
                      matrix[i][j] = max(matrix[i-1][j-weight[i]]+value[i], matrix[i-1][j]);
                  }

            }
        }
       return matrix[n][knapShakWeight+1];
    }

    private static int max(int a, int b){
        return (a > b) ? a :b;
    }
    public static void main(String args[]){
        int weight[] = {1,3,4,5};
        int value[] = {10,40,50,70};
        System.out.println(knapSackValue(weight,value,8));


    }
}
