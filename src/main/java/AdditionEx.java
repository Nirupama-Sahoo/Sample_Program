public class AdditionEx {

    public void printPairs(int arr[], int sum){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println("[ "+arr[i]+","+arr[j]+"]");
                }
            }

        }

    }
    public  static  void main(String args[]){
        AdditionEx additionEx = new AdditionEx();
        int arr[] = {1,2,3,4,5};
        additionEx.printPairs(arr,5);

    }

}
