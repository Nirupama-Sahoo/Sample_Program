package sample.lambda.demo4;

public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc sf,String s){
        return sf.func(s);
    }
    public static void main(String args[]){
        String inStr = "Lambda add power to java";
        String outStr;

        System.out.println("Here is the input String : "+ inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);

        System.out.println("The String in uppercase : "+outStr);

        outStr = stringOp((str) -> {
            String result = "";

            for(int i = 0 ; i < str.length() ; i++){
               if(str.charAt(i) != ' ')
                   result += str.charAt(i);
            }
            return  result;
        }, inStr);

        System.out.println("The string with space removed :"+ outStr);

        StringFunc reverseString = (str) -> {
            String result = "";
            for(int i = str.length()-1; i>=0 ; i--)
                result += str.charAt(i);
            return  result;
        };
        outStr = stringOp(reverseString,inStr);
        System.out.println("After string reverse  : "+outStr);

    }
}
