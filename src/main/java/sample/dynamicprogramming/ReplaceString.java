package sample.dynamicprogramming;

public class ReplaceString {
    public static int replaceString(String str1, String str2){
        char word1[] = str1.toCharArray();
        char word2[] = str2.toCharArray();
        int m = word1.length;
        int n = word2.length;
        int matrix[][] = new int[m][n];
        for(int i = 0; i <m; i++){
            for(int j = 0; j < n; j++){
                if(word1[i] == word2[2] ){
                    matrix[i][j] = matrix[i-1][j-1];
                }else if (word1[i] != word2[j]){
                    matrix[i][j] = min(matrix[i][j-1]+1, matrix[i-1][j-1]+1, matrix[i-1][j-1]+1);
                }
           }

        }
    return matrix[m][n];
    }
    private static int min(int x, int y, int z){        return 1;

    }
    public static void main(String args[]){

    }

}
