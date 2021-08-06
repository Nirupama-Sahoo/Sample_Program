package sample.array;

public class IncreasingAndDecreasingBinarySearch {
   static int findMaximumValue(int numbers[],int start,int end){
       if(start == end){
           return numbers[start];
       }
       if(end == start+1){
           if(numbers[end] > numbers[start]){
               return numbers[end];
           }else{
               return numbers[start];
           }
       }

       int mid = (start+end)/2;
       if(numbers[mid] > numbers[mid-1] && numbers[mid] > numbers[mid+1] ){
           return numbers[mid];
       }
       if(numbers[mid] < numbers[mid-1] && numbers[mid] >numbers[mid+1]){
          return findMaximumValue(numbers,start,mid-1);
       }else{
           return findMaximumValue(numbers,mid+1,end);
       }

    }
    public static void main(String args[]){
        int number[] = {6,9,15,25,35,50,45,29,3,8};
        int maximumValue = findMaximumValue(number,0,number.length-1);
        System.out.println("Maximun num :"+ maximumValue);

    }

}
