package sample.other;

public class NumberOfWays {
    static int NumberOfways(int sum, int K)
    {

        // Initialize a list
        int[] dp = new int[sum + 1];

        // Update dp[0] to 1
        dp[0] = 1;

        // Iterate over the range [1, K + 1]
        for(int i = 1; i < K + 1; i++)
        {

            // Iterate over the range [1, N + 1]
            for(int j = 1; j < sum + 1; j++)
            {

                // If col is greater
                // than or equal to row
                if (j >= i)

                    // Update current
                    // dp[col] state
                    dp[j] = dp[j] + dp[j - i];
            }
        }

        // Return the total number of ways
        return dp[sum];
    }
    public static void main(String args[]){
        int sum = 8;
        int K = 2;

        System.out.println(NumberOfways(sum, K));
    }
}
