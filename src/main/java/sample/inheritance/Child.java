package sample.inheritance;

public class Child extends Parent {
    public static void doSomething(){
        System.out.println("Child doing something");
    }
    public void eating(){
        System.out.println("Child eating");
    }
    public static void main(String args[]){
        Parent p = new Child();
        p.eating();
        p.doSomething();

    }
}
