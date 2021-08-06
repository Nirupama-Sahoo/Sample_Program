package sample.dynamicprogramming;

public class CountSteps {
    public static int countWays(int n)
    {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i <= n; i++)
            res[i] = res[i - 1] + res[i - 2];

        return res[n];
    }

    // Driver function
    public static void main(String argc[])
    {
        int n = 3;
        System.out.println(countWays(4));
    }
}
