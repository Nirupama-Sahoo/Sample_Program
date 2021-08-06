package sample.recursion;

public class PowerOfNumber {
    public static int findPower(int x, int n){
        int result;
        if(n == 0){
            return 1;
        }
      result = findPower(x,n/2);
        if(n%2 == 0){
            return result* result;
        }else
            return x * result*result;
    }
    public static void main(String args[]){
        System.out.println(findPower(4,4));
    }
}
