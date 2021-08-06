package sample.lambda.demo5;

public class MyStringOps {
    static String reverseString(String str){
        String result = "";
        for(int i = str.length()-1; i>=0 ; i--)
            result += str.charAt(i);
        return result;
    }
}
