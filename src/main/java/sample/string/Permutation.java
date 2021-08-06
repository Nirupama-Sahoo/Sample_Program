package sample.string;

public class Permutation {

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param start starting index
     * @param end end index
     */
    private void permute(String str, int start, int end)
    {
        if (start == end)
            System.out.println(str);
        else
        {
            for (int i = start; i <= end; i++)
            {
                str = swap(str,start,i);
                permute(str, start+1, end);
                str = swap(str,start,i);
            }
        }
    }

    private String swap(String str, int start, int end) {
        char charArray[] = str.toCharArray();
        char temp = charArray[start];
        charArray[start]= charArray[end];
        charArray[end] = temp;
        return String.valueOf(charArray);

    }

    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
    }


}
