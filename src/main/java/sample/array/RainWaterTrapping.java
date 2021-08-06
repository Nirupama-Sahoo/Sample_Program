package sample.array;

public class RainWaterTrapping {
    static int calculateWaterCount(int array[], int n){
        int result = 0;
        int maxRight[] = new int[n];
        int maxLeft[] = new int[n];


        maxRight[0]= array[n];
        for(int i = n; i >=0;  i--){
            if(array[i-1] < maxRight[i]){
                maxRight[i--] = maxRight[i];
            }
        }

        return result;
    }
    public static void main(String args[]){
        int array[] = {5,3,4,6,3,6};
        calculateWaterCount(array, array.length-1);


    }
}
