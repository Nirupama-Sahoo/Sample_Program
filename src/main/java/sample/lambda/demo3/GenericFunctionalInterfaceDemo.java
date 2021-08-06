package sample.lambda.demo3;

public class GenericFunctionalInterfaceDemo {
    public static void main(String args[]){
        SomeFun<String> stringFun = (str) ->{
          String reverseString = "";
          for(int i = str.length()-1; i>=0; i--)
              reverseString += str.charAt(i);

            return reverseString;
        };

        SomeFun<Integer> integerFun = (n) -> {
          int factorial = 1;
          for(int i = 1; i <=n ; i++)
              factorial = factorial*i;
            return factorial;
        };
        System.out.println("Factorial 6 :"+ integerFun.func(5));
        System.out.println("Reverse String of SAHOO :"+ stringFun.func("SAHOO"));

    }
}
