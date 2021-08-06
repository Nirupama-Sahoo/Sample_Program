package sample.array;

public class RemoveDuplicates {

   static int removeDuplicates(int array[],int n){
       if(n == 0 || n == 1)
            return n;
       int j = 0;
       int newSize = 0;
       for(int i = 0; i <n; i++){
           if(array[i]!=array[i+1]){
               array[j++] = array[i];
           }
       }
       array[j++] = array[n-1];
       newSize = j;
       for(j = 0; j <= newSize-1; j++){
           System.out.print(array[j]);
       }
   return j;
   }

    public static void main(String args[]){
        int array[] = {1,2,2,3,3,4,4,4,5,5};
        removeDuplicates(array, array.length-1);

    }
}
