package sample.lambda.demo0;

public class MyNumberTest {

    public static void main (String args[]){
        MyNumber myNumber;
        myNumber = () -> 200;
        MyNumberTest  myNum = new MyNumberTest();
        System.out.println("My Number  :"+myNumber.getValue());

    }

}
