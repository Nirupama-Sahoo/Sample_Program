package sample.array;

public class StringtoIntegerArray {
    public static void main(String args[]) {
        /*String[] str = {"1", "2", "3", "4"};

        for(int i = 0; i < str.length; i++){
            System.out.println(Integer.parseInt(str[i]));

        }*/

        String str = "1,2,3,4";
        String arr[] = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Integer.parseInt(arr[i]));
        }
    }
}
