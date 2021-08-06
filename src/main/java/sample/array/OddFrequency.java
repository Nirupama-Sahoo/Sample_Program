package sample.array;

public class OddFrequency {

   static int findOddFrequencyNumber(int array[], int n){
      int result = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j ++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                result =  array[i];
            }
        }
    return  result;
    }

    public static void main(String args[]){
        int array[] = {2,4,5,2,4,4,5,5,5,3,3};
        System.out.print(findOddFrequencyNumber(array,array.length));

    }
}
