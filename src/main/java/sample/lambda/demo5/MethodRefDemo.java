package sample.lambda.demo5;

public class MethodRefDemo {
    static  String stringOp (StringFunc sf, String str){
        return sf.func(str);
    }

    public static void main(String args[]){
        String inStr = "Lambda add power to Java";
        String outStr;
        outStr = stringOp(MyStringOps::reverseString,inStr);

        System.out.println("Original String :"+ inStr);
        System.out.println("String reversed :"+ outStr);

    }
}
