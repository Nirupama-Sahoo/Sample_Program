package sample.lambda.demo1;

public class BlockLambdaDemo1 {
    public static void main(String args[]){
        NumericFunc factorial = (n) -> {
          int result = 1;
           for (int i =1; i<=n; i++)
               result = i*result;

          return result;
        };

        System.out.println("Factorial of 3 : "+ factorial.func(3));
    }
}

