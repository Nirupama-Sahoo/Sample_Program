package sample.dynamicprogramming;

public class FibonacciWithDynamicPrograming {
    public int calculateFibonacci(int n){
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <n+1; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        FibonacciWithDynamicPrograming fib = new FibonacciWithDynamicPrograming();
        System.out.println("5th Fibonacci is ---> " + fib.calculateFibonacci(5));
        System.out.println("6th Fibonacci is ---> " + fib.calculateFibonacci(6));
        System.out.println("7th Fibonacci is ---> " + fib.calculateFibonacci(7));
    }
}
