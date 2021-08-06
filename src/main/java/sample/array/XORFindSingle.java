package sample.array;

public class XORFindSingle {
    static int findSingleElement(int array[], int n){
        int result = 0;
        for(int i = 0 ;i < n ; i++){
            result = result ^ array[i];

        }
        return result;
    }
    public static void main(String args[]){
        int array[] = {6,2,4,3,4,2,3};
        System.out.print("Result  :"+findSingleElement(array, array.length));

    }
}
