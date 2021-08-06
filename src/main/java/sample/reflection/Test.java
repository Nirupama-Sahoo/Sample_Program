package sample.reflection;

public class Test {
    private String s;

    public Test() {
        s = "GeeksforGeek";
    }

    public void method1() {
        System.out.println("The string is " + s);
    }

    public void method2(int n) {
        System.out.println("The number is " + n);
    }

    public void method3() {
        System.out.println("Private method invoked");
    }
}
