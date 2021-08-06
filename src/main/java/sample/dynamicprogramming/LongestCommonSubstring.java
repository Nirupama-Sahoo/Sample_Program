package sample.dynamicprogramming;

public class LongestCommonSubstring {
    public static int findLongestCommonSubsequence(String str1, String str2) {
        char X[] = str1.toCharArray();
        char Y[] = str2.toCharArray();
        int m = X.length;
        int n = Y.length;
        int maxLen = 0;
        int array[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    array[i][j] = array[i - 1][j - 1] + 1;
                    if(array[i][j] > maxLen)
                        maxLen = array[i][j];
                }
            }

        }
        return maxLen;
    }
    public static void main(String args[]){
        String str1 = "ABABC";
        String str2 = "BABCA";
        System.out.println(findLongestCommonSubsequence(str1,str2));
    }
}
