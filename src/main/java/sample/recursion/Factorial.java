package sample.recursion;

public class Factorial {
    int fact(int n){
        int result;

        if(n ==1 ) return n;
        result = fact(n -1) * n;
        return result;
    }
    public static void main (String args[]){
        Factorial factorial = new Factorial();

        System.out.println("Factorial of 3 is :  " + factorial.fact(3));
        System.out.println("Factorial of 3 is :  " + factorial.fact(5));

    }
}
