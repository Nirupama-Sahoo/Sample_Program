package sample.lambda.demo2;

public class BlockLambdaDemo2 {
    public static  void main(String args[]){
        StringFun reverse = (str) -> {
            String reversString = "";

            for(int i = str.length()-1; i >= 0; i--){
                reversString = reversString + str.charAt(i);
            }

            return  reversString;
        } ;
        System.out.println("Reverse String of NIRUPAMA   :"+reverse.func("NIRUPAMA"));
    }
}
