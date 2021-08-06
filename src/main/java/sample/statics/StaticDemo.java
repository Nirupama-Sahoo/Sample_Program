package sample.statics;

public class StaticDemo {
    static int a = 10;
    static int b = 20;
    int c = 30;

    public static int add(){
        //A non static variable can't accessed inside a static method
        //System.out.println("Value of c  : "+ c );
        return a+b;
    }
    public static void main(String args[]){
        System.out.println("Result  : "+ add());
    }
}
