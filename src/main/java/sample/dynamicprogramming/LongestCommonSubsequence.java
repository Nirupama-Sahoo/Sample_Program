package sample.dynamicprogramming;

public class LongestCommonSubsequence {
    public static int findLongestCommonSubsequence(String str1, String str2){
        char X[] = str1.toCharArray();
        char Y[] = str2.toCharArray();
        int m= X.length;
        int n = Y.length;
        int array[][] = new int[m+1][n+1];
        for(int i = 0 ; i<= m; i++){
            for(int j = 0; j<= n; j++){
                if(i == 0 || j == 0){
                    array[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]){
                    array[i][j] = array[i-1][j-1]+1;
                }else{
                    array[i][j] = max(array[i-1][j], array[i][j-1]);
                }
            }
        }
        return array[m][n];
    }
    private static int max(int a, int b){

        return (a > b) ? a :b;
    }
    public static void main(String args[]){
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
       System.out.println(findLongestCommonSubsequence(str1,str2));
    }
}
