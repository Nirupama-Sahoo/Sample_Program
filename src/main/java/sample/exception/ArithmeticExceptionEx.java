package sample.exception;

public class ArithmeticExceptionEx {
    public int divide(int a, int b){
        int result;
        try{
            result = a/b;
        }catch (ArithmeticException ex){
            throw  new ArithmeticException("Exception from catch block");

        }finally {

           // throw  new ArithmeticException("Exception from finally block");
            System.out.println("Exception from finally block");

        }
        return result;
    }
    public static void main(String args[]){
        ArithmeticExceptionEx arithmeticExceptionEx = new ArithmeticExceptionEx();
        arithmeticExceptionEx.divide(2,0);

    }
}
