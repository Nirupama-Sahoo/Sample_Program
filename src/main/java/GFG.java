import java.util.*;

class GFG {

    // Function to count distinct pairs
// in array whose sum equal to K
    static int cntDisPairs(int arr[],
                           int N, int K) {

        int cntPairs = 0;
        Arrays.sort(arr);
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (arr[i] + arr[j] == K) {
                  while (i < j && arr[i] == arr[i + 1]) {
                    i++;
                }

                while (i < j && arr[j] == arr[j - 1]) {
                    j--;
                }

                cntPairs += 1;
                i++;
                j--;
            }


            else if (arr[i] + arr[j] < K) {

                i++;
            } else {

                j--;
            }
        }
        return cntPairs;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {5, 6, 5, 7, 7, 8};
        int N = arr.length;
        int K = 13;
        System.out.print(cntDisPairs(arr, N, K));
    }

}